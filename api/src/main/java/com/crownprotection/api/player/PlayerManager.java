package com.crownprotection.api.player;

import com.crownprotection.api.player.model.ClaimPlayer;
import org.jetbrains.annotations.ApiStatus;

import java.util.UUID;
import java.util.function.Function;

/**
 * Manages player-related operations in the claim system.
 * This interface provides methods to load, edit, retrieve, and save player data.
 */
public interface PlayerManager {

    /**
     * Loads a player's data from storage.
     * This method is intended for internal use only.
     *
     * @param uniqueId the unique identifier (UUID) of the player to load.
     */
    @ApiStatus.Internal
    void loadFromStorage(UUID uniqueId);

    /**
     * Edits a player's data using the provided edit function.
     * The edit function takes the current state of the player and returns the modified state.
     *
     * @param uniqueId     the unique identifier (UUID) of the player to edit.
     * @param editFunction a function that modifies the player's data.
     * @return the updated `ClaimPlayer` object.
     */
    ClaimPlayer edit(UUID uniqueId, Function<ClaimPlayer, ClaimPlayer> editFunction);

    /**
     * Saves a player's data to storage.
     * This method is intended for internal use only.
     *
     * @param uniqueId the unique identifier (UUID) of the player to save.
     */
    @ApiStatus.Internal
    void saveToStorage(UUID uniqueId);

}