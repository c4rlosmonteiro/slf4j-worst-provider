package com.github.c4rlosmonteiro.slf4jworstprovideruser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Carlos Monteiro
 */
public final class HelloWorkGenerator {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorkGenerator.class);

    public static String generateHelloWorldMessage(final String name) {
        LOGGER.debug(String.format("Generating hello world message for [%s]", name));
        return String.format("Hello %s!", name);
    }
}
