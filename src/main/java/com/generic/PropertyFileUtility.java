package com.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
	
	/**
	 * @author Satyajeet
	 * This method is used to read data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readdata(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("../VTIGER_prac/commonProp.properties");
		Properties prop=new Properties();
		prop.load(fis);
		 String value = prop.getProperty(key);
		 return value;
	}
	
	
	

}
