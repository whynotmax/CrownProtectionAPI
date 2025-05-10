# CrownProtection - Developer API and Documentation

## Overview
CrownProtection is a powerful and flexible tool designed to enhance the security of your Minecraft server. It provides a range of features to protect your world from unwanted changes, including block protection, region management, and more.
You can buy the plugin on here: [SpigotMC](https://www.spigotmc.org/resources/crownprotection.1111111/) [BuildByBit](https://buildbybit.com/resources/crownprotection.1111111/) [MC-Market](https://www.mc-market.org/resources/crownprotection.1111111/) [MC-Market](https://www.mc-market.org/resources/crownprotection.1111111/) [MC-Market](https://www.mc-market.org/resources/crownprotection.1111111/) [MC-Market](https://www.mc-market.org/resources/crownprotection.1111111/) [MC-Market](https://www.mc-market.org/resources/crownprotection.1111111/)

## Developer API

CrownProtection provides a comprehensive API that allows developers to interact with the plugin programmatically. This API is designed to be easy to use and flexible, enabling you to create custom features and integrations for your server.
The API is built on top of the Bukkit API, which means that you can use it in any Bukkit-compatible server environment. The API is designed to be intuitive and easy to use, with clear documentation and examples to help you get started.

## How to Use the API
To use the CrownProtection API, you need to include the plugin as a dependency in your project. You can do this by adding the following line to your `pom.xml` file if you're using Maven:

```xml
<repository>
    <id>crownprotection-repo</id>
    <url>https://repo.crownprotection.com/releases</url>
</repository>
<dependency>
    <groupId>com.crownprotection</groupId>
    <artifactId>CrownProtection</artifactId>
    <version>1.0.0</version>
    <scope>provided</scope>
</dependency>
```
If you're using Gradle, you can add the following line to your `build.gradle` file:

```groovy
repositories {
    maven {
        url "https://repo.crownprotection.com/releases"
    }
}
dependencies {
    compileOnly 'com.crownprotection:CrownProtection:1.0.0'
}
```
Make sure to replace `1.0.0` with the actual version of the plugin you are using.

## Example Usage

Here is a simple example of how to use the CrownProtection API:

```java
import com.crownprotection.api.CrownProtectionAPI;
import com.crownprotection.api.claim.ClaimManager;
import com.crownprotection.api.claim.ClaimStorage;
import com.crownprotection.api.claim.Claim;
import com.crownprotection.api.claim.Position;

import java.util.Optional;

public class ExampleUsage {

    public void example() {
        // Get the CrownProtectionAPI instance
        CrownProtectionAPI api = CrownProtectionAPI.get();

        // Access the ClaimManager
        ClaimManager claimManager = api.getClaimManager();

        // Access the ClaimStorage
        ClaimStorage claimStorage = api.getClaimStorage();

        // Example: Get all claims for a player
        List<Claim> claims = claimManager.getClaims(player);

        // Example: Get a specific claim by ID
        Optional<Claim> claimOptional = claimManager.getClaim(claimId);
        if (claimOptional.isPresent()) {
            Claim claim = claimOptional.get();
            // Do something with the claim
        } else {
            // Claim not found
        }
        
        // Example: Get a claim at a specific location
        Position position = new Position("world", x, y, z);
        Optional<Claim> claimAtPosition = claimManager.getClaimAt(position);
        if (claimAtPosition.isPresent()) {
            Claim claim = claimAtPosition.get();
            // Do something with the claim
        } else {
            // No claim found at this position
        }
        
        // Example: Create a new claim
        Position position1 = new Position("world", x1, y1, z1);
        Position position2 = new Position("world", x2, y2, z2);
        claimManager.createClaim(player.getUniqueId(), position1, position2);
        
        // Example: Delete a claim
        claimManager.removeClaim(claimId);
        
    }
}
```

## Conclusion

CrownProtection is a powerful tool for enhancing the security of your Minecraft server. With its comprehensive API, you can easily create custom features and integrations to suit your needs. Whether you're a server owner or a developer, CrownProtection has something to offer.
If you have any questions or need assistance, feel free to reach out to the [CrownDevelopemnt community discord](https://discord.com/invite/bJQRV5GeZg) or check the official documentation for more information.