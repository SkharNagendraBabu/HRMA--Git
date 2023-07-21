package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC005_Alerts_or_Popups {

	//public static void main(String[] args) throws Exception{
	@Test
	public void alert()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		General grl = new General();
		grl.openapplication();
		Thread.sleep(3000);
		grl.alerts_Or_Popups();
		Thread.sleep(3000);
		grl.logout();
		grl.closeapplication();
		
	}

}
