package com.github.cmonteiro.slf4jworstprovideruser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Carlos Monteiro
 */
public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(final String [] args) {
        LOGGER.info("Generating hello world messages!");
        LOGGER.info(":: " + HelloWorkGenerator.generateHelloWorldMessage("Bob"));
        LOGGER.info(":: " + HelloWorkGenerator.generateHelloWorldMessage("Paul"));
        LOGGER.info(":: " + HelloWorkGenerator.generateHelloWorldMessage("Marcus"));
    }
}
