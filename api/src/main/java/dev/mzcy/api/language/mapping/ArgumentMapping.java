package dev.mzcy.api.language.mapping;

import org.jetbrains.annotations.NotNull;

public record ArgumentMapping(String key, String value) {

    public ArgumentMapping {
        if (key == null || key.isEmpty()) {
            throw new IllegalArgumentException("Key cannot be null or empty");
        }
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty");
        }
    }

    @Override
    public @NotNull String toString() {
        return key + "=" + value;
    }
}
