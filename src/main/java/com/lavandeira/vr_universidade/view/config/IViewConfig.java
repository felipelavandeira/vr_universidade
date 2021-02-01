package com.lavandeira.vr_universidade.view.config;

import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author felipelavandeira
 */
public interface IViewConfig {
    
    String FILENAME = "endpoints.properties";
    Properties properties = new Properties();
    
    public void loadProperties() throws IOException;
}
