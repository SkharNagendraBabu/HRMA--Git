package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC007_GetAllLinks {
	
	@Test
	public void alllinks()throws Exception{
		DOMConfigurator.configure("log4j.xml");
	General obj=new General();
	obj.openapplication();
	obj.login();
	obj.getall_links();
	obj.logout();
	obj.closeapplication();
		
		
		
		
	}

}
