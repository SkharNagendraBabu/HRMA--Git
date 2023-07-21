package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC004_PIM_AddEmployee {
	
	//public static void main(String[] args)throws Exception {
	
	@Test
	public void addemp()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		General grl = new General();
		grl.openapplication();
		grl.login();
		Thread.sleep(3000);
		grl.pim_addEmployee();
		grl.logout();
		grl.closeapplication();
		

	}


}
