package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002_Verification {
	
	
	//public static void main(String[] args) throws Exception {
	
	
	@Test
	public void user_verification()throws Exception{
		
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openapplication();
		obj.verifyapplicationTitle();
		obj.login();
		obj.verifyapplicationTitle2();
		obj.logout();
		obj.closeapplication();
		
	}

}


