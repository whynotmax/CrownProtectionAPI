package dev.mzcy.api.claim.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

/**
 * Represents a player trusted within a claim.
 * Contains the player's unique identifier and the timestamp of when they were trusted.
 */
@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TrustedPlayer {

    /**
     * The unique identifier of the trusted player.
     */
    UUID uniqueId;

    /**
     * The timestamp (in milliseconds since epoch) when the player was trusted.
     */
    long trustedSince;

}
