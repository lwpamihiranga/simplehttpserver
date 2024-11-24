package com.amithmihiranga.httpserver.config;

import java.lang.module.Configuration;

public class ConfigurationManager {
    private static ConfigurationManager myConfigurationManager;
    private static Configuration myCurrentConfiguration;

    private ConfigurationManager() {}

    public static ConfigurationManager getInstance() {
        if (myConfigurationManager == null)
            myConfigurationManager = new ConfigurationManager();

        return myConfigurationManager;
    }

    /**
     * Used to load a configuration file by the path provided
     * @param filePath
     */
    public void loadConfigurationFile(String filePath) {}

    /**
     * Returns the current loaded configuration
     */
    public void getCurrentConfiguration() {}
}
