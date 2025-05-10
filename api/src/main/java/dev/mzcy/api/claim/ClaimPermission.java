package dev.mzcy.api.claim;

/**
 * Represents the different types of permissions that can be assigned within a claim.
 */
public enum ClaimPermission {
    /**
     * Permission to build or modify blocks within the claim.
     */
    BUILD,

    /**
     * Permission to interact with objects (e.g., doors, chests) within the claim.
     */
    INTERACT,

    /**
     * Permission to engage in player-versus-player combat within the claim.
     */
    PVP
}
