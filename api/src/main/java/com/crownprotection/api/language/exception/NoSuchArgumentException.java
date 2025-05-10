package com.crownprotection.api.language.exception;

/**
 * Exception thrown when a translation is not found.
 */
public class NoSuchArgumentException extends RuntimeException {

    /**
     * Constructs a new NoSuchTranslationException with no specified detail message.
     */
    public NoSuchArgumentException() {
        super("No such argument mapping found.");
    }

    /**
     * Constructs a new NoSuchTranslationException with the specified detail message.
     *
     * @param message the detail message
     */
    public NoSuchArgumentException(String message) {
        super("No such argument mapping found: " + message);
    }

    /**
     * Constructs a new NoSuchTranslationException with the specified detail message and cause.
     *
     * @param message the detail message
     * @param cause   the cause of the exception
     */
    public NoSuchArgumentException(String message, Throwable cause) {
        super(message, cause);
    }
}
