package com.github.cmonteiro.sl4jworstprovider;

import com.github.cmonteiro.sl4jworstprovider.internalcomponents.SLF4JWorkProviderLoggerFactory;
import org.slf4j.ILoggerFactory;
import org.slf4j.IMarkerFactory;
import org.slf4j.helpers.NOPMDCAdapter;
import org.slf4j.spi.MDCAdapter;
import org.slf4j.spi.SLF4JServiceProvider;

/**
 * @author Carlos Monteiro
 */
public class SLF4JWorstProvider implements SLF4JServiceProvider {

    private final String REQUESTED_API_VERSION = "2.0.13";

    private SLF4JWorkProviderLoggerFactory slf4JWorkProviderLoggerFactory;

    @Override
    public ILoggerFactory getLoggerFactory() {
        return slf4JWorkProviderLoggerFactory;
    }

    @Override
    public IMarkerFactory getMarkerFactory() {
        return null;
    }

    @Override
    public MDCAdapter getMDCAdapter() {
        return new NOPMDCAdapter();
    }

    @Override
    public String getRequestedApiVersion() {
        return REQUESTED_API_VERSION;
    }

    @Override
    public void initialize() {
        slf4JWorkProviderLoggerFactory = new SLF4JWorkProviderLoggerFactory();
    }
}

