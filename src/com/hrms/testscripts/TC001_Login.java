package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001_Login {
	
	
	 //public static void main(String args[])throws Exception{
		@Test
		public void login_user()throws Exception{
			DOMConfigurator.configure("log4j.xml");
			General obj = new  General();
			obj.openapplication();
			obj.login();
			obj.logout(); 
			obj.closeapplication();
			
		}


}
