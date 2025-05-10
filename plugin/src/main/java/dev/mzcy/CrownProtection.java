package dev.mzcy;

import dev.mzcy.api.CrownProtectionAPI;
import dev.mzcy.api.claim.ClaimManager;
import dev.mzcy.api.claim.ClaimStorage;
import dev.mzcy.claim.IClaimManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CrownProtection extends CrownProtectionAPI {

    private static CrownProtection instance;

    ClaimManager claimManager;
    ClaimStorage claimStorage;

    @Override
    public void onEnable() {
        instance = this;
        log.info("Starting CrownProtection...");

        this.claimManager = new IClaimManager();

        set(this);
        log.info("CrownProtectionAPI initialized.");
    }

    @Override
    public void onDisable() {
        log.info("CrownProtectionAPI disabled.");
        instance = null;
        set(null);
    }

    @Override
    public ClaimManager getClaimManager() {
        return this.claimManager;
    }

    @Override
    public ClaimStorage getClaimStorage() {
        return this.claimStorage;
    }
}
