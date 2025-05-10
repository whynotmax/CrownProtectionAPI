package dev.mzcy.claim;

import dev.mzcy.api.claim.Claim;
import dev.mzcy.api.claim.ClaimManager;
import dev.mzcy.api.claim.Position;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class IClaimManager implements ClaimManager {

    /**
     * Retrieves all claims owned by a specific player.
     *
     * @param player the UUID of the player whose claims are to be retrieved.
     * @return a list of claims owned by the player.
     */
    @Override
    public List<Claim> getClaims(UUID player) {
        return List.of();
    }

    /**
     * Retrieves a claim by its unique identifier.
     *
     * @param id the unique identifier of the claim.
     * @return an Optional containing the claim if found, or an empty Optional if not.
     */
    @Override
    public Optional<Claim> getClaim(int id) {
        return Optional.empty();
    }

    /**
     * Retrieves the claim at a specific position.
     *
     * @param pos the position to check for a claim.
     * @return an Optional containing the claim at the position, or an empty Optional if none exists.
     */
    @Override
    public Optional<Claim> getClaimAt(Position pos) {
        return Optional.empty();
    }

    /**
     * Creates a new claim with the specified owner and boundary corners.
     *
     * @param owner the UUID of the player who will own the claim.
     * @param pos1  the first corner of the claim's boundary.
     * @param pos2  the second corner of the claim's boundary.
     */
    @Override
    public void createClaim(UUID owner, Position pos1, Position pos2) {

    }

    /**
     * Removes a claim by its unique identifier.
     *
     * @param id the unique identifier of the claim to be removed.
     */
    @Override
    public void removeClaim(int id) {

    }

    /**
     * Loads all claims from persistent storage.
     */
    @Override
    public void loadClaims() {

    }

    /**
     * Saves all claims to persistent storage.
     */
    @Override
    public void saveClaims() {

    }
}
