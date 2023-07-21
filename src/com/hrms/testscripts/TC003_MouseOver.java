package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC003_MouseOver {
	
	
	//public static void main(String[] args) throws Exception{
	@Test
	
	public void user_mouseover()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		General grl = new General();
		grl.openapplication();
		grl.login();
		Thread.sleep(3000);
		grl.mouseOverToPIMmordul();
		Thread.sleep(2000);
		grl.logout();
		Thread.sleep(3000);
		grl.closeapplication();
	}



}
