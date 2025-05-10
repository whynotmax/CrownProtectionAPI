package com.crownprotection.api.language;

import com.crownprotection.api.language.exception.NoSuchArgumentException;
import com.crownprotection.api.language.exception.NoSuchTranslationException;
import com.crownprotection.api.language.mapping.ArgumentMapping;

/**
 * This interface is responsible for managing translations within the application.
 * It provides methods to translate keys into their corresponding messages.
 */
public interface TranslationManager {

    /**
     * Translates a given key into its corresponding message.
     *
     * @param key The key to be translated.
     * @return The translated message.
     * @throws NoSuchTranslationException if the key does not exist in the translation files.
     */
    String translate(String key) throws NoSuchTranslationException;

    /**
     * Translates a given key into its corresponding message, with the option to
     * include argument mappings.
     *
     * @param key      The key to be translated.
     * @param mappings The argument mappings to be included in the translation.
     * @return The translated message with the applied mappings.
     * @throws NoSuchTranslationException if the key does not exist in the translation files.
     * @throws NoSuchArgumentException if any of the provided mappings are invalid.
     */
    String translate(String key, ArgumentMapping... mappings) throws NoSuchTranslationException, NoSuchArgumentException;

}
