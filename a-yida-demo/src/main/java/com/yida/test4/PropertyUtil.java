package com.yida.test4;

import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {
    private static String RESOURCE_NAME = "application.yml";
    private static  Properties properties;

    static {
        try {
            properties = PropertiesLoaderUtils.loadAllProperties(RESOURCE_NAME);
        } catch (IOException e) {
        }
    }

    public static String getValue(String key) {
        return properties.getProperty(key);
    }
}