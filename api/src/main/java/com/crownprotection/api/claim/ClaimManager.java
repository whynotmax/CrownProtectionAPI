package com.crownprotection.api.claim;

import com.crownprotection.api.claim.model.Claim;
import org.jetbrains.annotations.ApiStatus;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Manages claims in the system, providing functionality to retrieve, create, and remove claims.
 */
public interface ClaimManager {

    /**
     * Retrieves all claims owned by a specific player.
     *
     * @param player the UUID of the player whose claims are to be retrieved.
     * @return a list of claims owned by the player.
     */
    List<Claim> getClaims(UUID player);

    /**
     * Retrieves a claim by its unique identifier.
     *
     * @param id the unique identifier of the claim.
     * @return an Optional containing the claim if found, or an empty Optional if not.
     */
    Optional<Claim> getClaim(int id);

    /**
     * Retrieves the claim at a specific position.
     *
     * @param pos the position to check for a claim.
     * @return an Optional containing the claim at the position, or an empty Optional if none exists.
     */
    Optional<Claim> getClaimAt(Position pos);

    /**
     * Creates a new claim with the specified owner and boundary corners.
     *
     * @param owner the UUID of the player who will own the claim.
     * @param pos1  the first corner of the claim's boundary.
     * @param pos2  the second corner of the claim's boundary.
     */
    void createClaim(UUID owner, Position pos1, Position pos2);

    /**
     * Removes a claim by its unique identifier.
     *
     * @param id the unique identifier of the claim to be removed.
     */
    void removeClaim(int id);

    /**
     * Loads all claims from persistent storage.
     * @implNote This method is intended for internal use only and should not be called directly.
     */
    @ApiStatus.Internal
    void loadClaims();

    /**
     * Saves all claims to persistent storage.
     * @implNote This method is intended for internal use only and should not be called directly.
     */
    @ApiStatus.Internal
    void saveClaims();
}