package com.github.c4rlosmonteiro.sl4jworstprovider.internalcomponents;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

/**
 * @author Carlos Monteiro
 */
public class SLF4JWorkProviderLoggerFactory implements ILoggerFactory {
    @Override
    public Logger getLogger(final String name) {
        return new SLF4JWorkProviderLogger(name);
    }
}
