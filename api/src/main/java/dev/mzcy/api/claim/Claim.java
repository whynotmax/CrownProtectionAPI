package dev.mzcy.api.claim;

import java.util.Set;
import java.util.UUID;

/**
 * Represents a claim in the system, which is a defined area owned by a player.
 * A claim has an owner, trusted players, and two corners defining its boundaries.
 */
public interface Claim {

    /**
     * Gets the UUID of the owner of the claim.
     *
     * @return the UUID of the owner.
     */
    UUID getOwner();

    /**
     * Gets the set of players trusted by the owner to interact with the claim.
     *
     * @return a set of trusted players.
     */
    Set<TrustedPlayer> getTrustedPlayers();

    /**
     * Gets the first corner of the claim's boundary.
     *
     * @return the position of the first corner.
     */
    Position getFirstCorner();

    /**
     * Gets the second corner of the claim's boundary.
     *
     * @return the position of the second corner.
     */
    Position getSecondCorner();

    /**
     * Gets the unique identifier of the claim.
     *
     * @return the claim's ID.
     */
    int getId();

    /**
     * Checks if a given position is within the boundaries of the claim.
     *
     * @param pos the position to check.
     * @return true if the position is within the claim, false otherwise.
     */
    boolean contains(Position pos);

    /**
     * Adds a player to the list of trusted players for the claim.
     *
     * @param player the UUID of the player to trust.
     */
    void trustPlayer(UUID player);

    /**
     * Removes a player from the list of trusted players for the claim.
     *
     * @param player the UUID of the player to untrust.
     */
    void untrustPlayer(UUID player);
}