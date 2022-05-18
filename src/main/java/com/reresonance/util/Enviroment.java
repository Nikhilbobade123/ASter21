package com.reresonance.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class Enviroment {
	/**
	 * This method return the app.url present in enviroment.proprities file
	 * 
	 * @return
	 * 
	 * @throws FileNotFoundException
	 */

	public String getAppUrl() throws FileNotFoundException {
		String baseDir = System.getProperty("user.dir");// Current user directory made
	//	System.out.println("Base DIR:" + baseDir);
		FileInputStream fis = new FileInputStream(baseDir + "/src/main/resources/environment.properties");
		Properties prop = new Properties();
		// how to read properties
		String value = "";
		try {
			prop.load(fis);
			value = prop.getProperty("app_url");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;

	}

	public static void main(String[] args) throws FileNotFoundException {
		new Enviroment().getAppUrl();
	}

}
