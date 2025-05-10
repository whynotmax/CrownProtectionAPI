package com.crownprotection.api;

import com.crownprotection.api.claim.ClaimManager;
import com.crownprotection.api.claim.ClaimStorage;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.ApiStatus;

import javax.annotation.Nullable;

/**
 * Provides the main API for interacting with the Crown Protection system.
 * Allows access to claim management and storage functionalities.
 */
public abstract class CrownProtectionAPI extends JavaPlugin {

    private static CrownProtectionAPI instance;

    /**
     * Initializes the API instance.
     *
     * @return CrownProtectionAPI instance.
     * @throws IllegalStateException if the instance is already initialized.
     */
    public static CrownProtectionAPI get() {
        if (instance == null) {

        }
        return instance;
    }

    /**
     * Sets the API instance.
     *
     * @param api the CrownProtectionAPI instance to set.
     */
    public static void set(@Nullable CrownProtectionAPI api) {
        instance = api;
    }

    /**
     * Called when the plugin is enabled.
     * This method should be overridden to perform any necessary initialization.
     */
    @Override
    @ApiStatus.Internal
    public abstract void onEnable();

    /**
     * Called when the plugin is disabled.
     * This method should be overridden to perform any necessary cleanup.
     */
    @Override
    @ApiStatus.Internal
    public abstract void onDisable();

    /**
     * Retrieves the claim manager responsible for managing claims.
     *
     * @return the ClaimManager instance.
     */
    public abstract ClaimManager getClaimManager();

    /**
     * Retrieves the claim storage responsible for persisting claims.
     *
     * @return the ClaimStorage instance.
     */
    public abstract ClaimStorage getClaimStorage();

}
