package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC006_GetAllOptions_dropdown {
	
	
	
	@Test
	public void alloptions()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openapplication();
		obj.login();
		obj.getalloptions_dropdown();
		obj.logout();
		obj.closeapplication();
		
	}

}
