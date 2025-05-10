package com.crownprotection.api.player;

import com.crownprotection.api.player.model.ClaimPlayer;

import java.util.UUID;

/**
 * Interface for managing the storage of player data in the claim system.
 * Provides methods to load, save, and shut down player-related storage operations.
 */
public interface PlayerStorage {

    /**
     * Loads a player's data from storage.
     *
     * @param uniqueId the unique identifier (UUID) of the player to load.
     * @return the `ClaimPlayer` object representing the player's data.
     */
    ClaimPlayer loadPlayer(UUID uniqueId);

    /**
     * Saves a player's data to storage.
     *
     * @param player the `ClaimPlayer` object representing the player's data to save.
     */
    void savePlayer(ClaimPlayer player);

    /**
     * Shuts down the player storage system, releasing any resources held.
     */
    void shutdown();

}