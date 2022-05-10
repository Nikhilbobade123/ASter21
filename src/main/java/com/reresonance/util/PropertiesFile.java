package com.reresonance.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	public String getValue(String filePath, String key) {
	String baseDir=	System.getProperty("app_url"); 
	String value ="";
		try {
			FileInputStream fis = new FileInputStream(baseDir+filePath);
			Properties prop = new Properties();
            
				prop.load(fis);
				prop.getProperty(key);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	return value;
	}

}
