package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC005_KA_RC {

	//public static void main(String[] args)throws Exception {
	@Test

	public void keyboardaction()throws Exception{
		DOMConfigurator.configure("log4j.xml");
		General grl = new General();
		grl.openapplication();
		grl.keyboardActions();
		grl.logout();
		grl.closeapplication();
	}

}
