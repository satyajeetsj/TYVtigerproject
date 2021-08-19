package com.generic;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class XML_FileUtility {
	/**
	 * @author Satyajeet
	 * This method is used to read data from XML file
	 * @param key
	 * @return
	 * @throws DocumentException
	 */
	public String readXML(String key) throws DocumentException
	{
		File inputfile=new File("../VTIGER_prac/commonXML.xml");
		SAXReader reader=new SAXReader();
		Document doc = reader.read(inputfile);
		String value = doc.selectSingleNode(key).getText();
		return value;
	}

}
