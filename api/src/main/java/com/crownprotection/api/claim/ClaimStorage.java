package com.crownprotection.api.claim;

import com.crownprotection.api.claim.model.Claim;

import java.util.List;
import java.util.Optional;

/**
 * Provides an interface for storing and managing claims in the system.
 */
public interface ClaimStorage {

    /**
     * Saves a claim to the storage.
     *
     * @param claim the claim to be saved.
     */
    void saveClaim(Claim claim);

    /**
     * Removes a claim from the storage by its unique identifier.
     *
     * @param id the unique identifier of the claim to be removed.
     */
    void removeClaim(int id);

    /**
     * Loads a claim from the storage by its unique identifier.
     *
     * @param id the unique identifier of the claim to be loaded.
     * @return an Optional containing the claim if found, or an empty Optional if not.
     */
    Optional<Claim> loadClaim(int id);

    /**
     * Loads all claims from the storage.
     *
     * @return a list of all claims in the storage.
     */
    List<Claim> loadAllClaims();

    /**
     * Shuts down the storage, releasing any resources held.
     */
    void shutdown();
}
