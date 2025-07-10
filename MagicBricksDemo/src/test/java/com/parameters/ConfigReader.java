package com.parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static Properties prop;

	public static Properties getProperties() {
		if (prop == null) {
			prop = new Properties();
			try {
				FileInputStream fis = new FileInputStream(
						"C:\\Users\\SHRDEOKA\\eclipse-workspace\\MagicBricksDemo\\src\\test\\resource\\Property\\config.properties");
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("❌ Failed to load config.properties");
			}
		}
		return prop;
	}

	public static String get(String key) {
		return getProperties().getProperty(key);
	}
}
