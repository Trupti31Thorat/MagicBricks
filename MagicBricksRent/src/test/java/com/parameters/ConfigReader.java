package com.parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static Properties properties;

	static {
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\SHANKARE\\eclipse-workspace\\MagicBricksRent\\src\\test\\resource\\PropertyFiles\\config.properties");
			properties = new Properties();
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to load config.properties");
		}
	}

	public static String getProperty(String key) {
		return properties.getProperty(key);
	}
}
