package com.hrms.lib;

	import org.openqa.selenium.WebDriver;

	public class Global {
		
	     public WebDriver driver;
		
		//To provide testData & Object/element for whole application
		//***********TestDate
		public String url="http://183.82.103.245/nareshit/login.php";
		public String un= "nareshit";
		public String pw ="nareshit"; 
	    public String title ="OrangeHRM - New Level of HR Management";
	    public String title2 ="OrangeHRM";
	    public String firstName = "Sekhar";
	    public String lasttName = "Nagendra Babu";
		//***********Object/Element
		public String txt_loginname ="txtUserName";   //name
		public String txt_password   = "txtPassword";   //name
		public String btn_login      ="Submit";
		public String link_logout    ="Logout";
		public String mousOver_To_PIM_Mordul ="//span[text()=\"PIM\"]"; // text Xpath 
		public String addEmployee_submenuOF_PIM_mordul ="//span[text()=\"Add Employee\"]";//Relative Xpath
		public String btn_Add_under_EmployeeInformation = "div.outerbox:nth-child(1) div.maincontent form:nth-child(1) div.actionbar:nth-child(7) div.actionbuttons > input.plainbtn:nth-child(1)";//cssSelectore
		public String enter_firstName_under_AddEmployee ="txtEmpFirstName";//name
		public String enter_lastName_under_AddEmployee ="txtEmpLastName";//Id
		public String btn_save_under_AddEmployee="btnEdit";//id
		public String enterframe_subMenu_EmployeeInformation="rightMenu";//Id

	
	
}
