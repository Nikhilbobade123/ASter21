package com.reresonance.util;

public class OR {
	String filePath = "/src/main/resources/OR.properties";
    PropertiesFile prop = new PropertiesFile();

	public String getassignmentsLocator() {
         PropertiesFile prop=new PropertiesFile();
          return prop.getValue(filePath,"assignments");
	
	}
	public String confirmationAlertLocator() {
		
		return prop.getValue(filePath,"confirmation-alert");
	}

}
