package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import com.base.BaseClass;

public class PropertiesUtils extends BaseClass{

public static FileInputStream fis;
	public static Properties prop;
	
	public static String readProperty(String key) {
		log.info("reading a property file for a key"+key);
		prop=new Properties();
		
		  
		try {
			fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties");
			prop.load(fis);
		} catch (Exception e) {
			log.error("value is not found in property file");
			e.printStackTrace();
		}
		log.info("value found for a key");
		return prop.getProperty(key);
	}
}
