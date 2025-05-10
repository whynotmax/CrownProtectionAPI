package com.crownprotection.api.player.model;

import java.util.List;
import java.util.UUID;

/**
 * Represents a player in the claim system.
 * This interface provides methods to manage claim-related data for a player,
 * such as their unique identifier, claim blocks, and associated claim IDs.
 */
public interface ClaimPlayer {

    /**
     * Gets the unique identifier (UUID) of the player.
     *
     * @return the UUID of the player.
     */
    UUID getUniqueId();

    /**
     * Gets the number of claim blocks available to the player.
     *
     * @return the number of claim blocks.
     */
    int getClaimBlocks();

    /**
     * Sets the number of claim blocks available to the player.
     *
     * @param claimBlocks the new number of claim blocks.
     */
    void setClaimBlocks(int claimBlocks);

    /**
     * Adds a specified number of claim blocks to the player's total.
     *
     * @param claimBlocks the number of claim blocks to add.
     */
    void addClaimBlocks(int claimBlocks);

    /**
     * Removes a specified number of claim blocks from the player's total.
     *
     * @param claimBlocks the number of claim blocks to remove.
     */
    void removeClaimBlocks(int claimBlocks);

    /**
     * Gets a list of claim IDs associated with the player.
     *
     * @return a list of claim IDs.
     */
    List<Integer> getClaimIds();

    /**
     * Adds a claim ID to the player's list of associated claims.
     *
     * @param claimId the claim ID to add.
     */
    void addClaimId(int claimId);

    /**
     * Removes a claim ID from the player's list of associated claims.
     *
     * @param claimId the claim ID to remove.
     */
    void removeClaimId(int claimId);

}