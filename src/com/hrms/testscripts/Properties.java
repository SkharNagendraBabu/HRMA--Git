package com.hrms.testscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Properties {
	Properties prop;
	public Properties init_properties()
	{
	prop = new Properties();
	try {
	FileInputStream ip = new FileInputStream("E:\\Selenium_Workspace\\HRMS_Project\\src\\com\\hrms\\testscripts\\testdata.properties");
	prop.load(ip);
	} catch (FileNotFoundException e) {
	e.printStackTrace();
	}catch (IOException e)
	{
	e.printStackTrace();
	}

	return prop;
}
	private void load(FileInputStream ip) {
		// TODO Auto-generated method stub
		
	}
