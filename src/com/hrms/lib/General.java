package com.hrms.lib;
	import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.Log;

import jxl.Sheet;
import jxl.Workbook;

	public class General extends Global{



		public void openapplication(String browser)throws Exception{
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Workspace\\HRMS_Project\\src\\drivers\\chromedriver.exe");
     if(browser.equals("chrome"))
     {
			driver =new ChromeDriver();
			driver.manage().window().maximize();
     }
     else if(browser.equals("firefox"))
     {
    	 
     }
			FileInputStream file=new FileInputStream("E:\\Selenium_Workspace\\HRMS_Project\\HRMS_Project.xls");
			Workbook wb=Workbook.getWorkbook(file);
			Sheet st=wb.getSheet(0);
			int row=2;
			
			String url=st.getCell(1, row).getContents();
				
			
			
			
			
			driver.get(url);
			System.out.println("Application Opened");
			Log.info("Application Opened");
		}

		public void closeapplication() throws Exception{
			driver.close();
			Thread.sleep(3000);
			Log.info("Application Closed");
		}


		public void login()throws Exception{
			FileInputStream file=new FileInputStream("E:\\Selenium_Workspace\\HRMS_Project\\HRMS_Project.xls");
			Workbook wb=Workbook.getWorkbook(file);
			Sheet st=wb.getSheet(0);
			int row=2;
			String loginname=st.getCell(2, row).getContents();
			String password=st.getCell(3, row).getContents();
			
			driver.findElement(By.name(txt_loginname)).sendKeys(loginname);
			driver.findElement(By.name(txt_password)).sendKeys(password);
			Thread.sleep(3000);
			driver.findElement(By.name(btn_login)).click();
			Log.info("Login completed");

		}
		public void logout()throws Exception{
			driver.findElement(By.linkText("Logout")).click();
			Log.info("Logout completed");
		}
		public void verifyapplicationTitle ()throws Exception{
			if(driver.getTitle().equals(title)){
				System.out.println("Title Matched");
			}
			else {
				System.out.println("Title Not matched"+"Actual Title is:"+driver.getTitle());
			}

		}
		public void verifyapplicationTitle2()throws Exception{
			if(driver.getTitle().equals(title2)){
				System.out.println("Title Matched");
			}
			else {
				System.out.println("Title Not matched"+"Actual Title is:"+driver.getTitle());
			}
		}
		public void mouseOverToPIMmordul()throws Exception{
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath(mousOver_To_PIM_Mordul))).perform();
			System.out.println("MouseOver Complited");
			Thread.sleep(3000);
			driver.findElement(By.xpath(addEmployee_submenuOF_PIM_mordul)).click();
			//act.moveToElement(driver.findElement(By.xpath("//*[@id=\"pim\"]/a"))).perform();
			//System.out.println("MouseOver Done");
			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//*[@id=\"pim\"]/ul/li[2]/a/span")).click();
			//Thread.sleep(4000);
			//driver.findElement(By.linkText("Logout")).click();

		}
		public void pim_addEmployee() throws Exception{

			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath(mousOver_To_PIM_Mordul))).perform();
			System.out.println("MouseOver Complited");
			Thread.sleep(3000);
			driver.findElement(By.xpath(addEmployee_submenuOF_PIM_mordul)).click();



			//Enter into frame
			driver.switchTo().frame("rightMenu");
			//driver.findElement(By.cssSelector(btn_Add_under_EmployeeInformation)).click();
			driver.findElement(By.id(enter_lastName_under_AddEmployee)).sendKeys(lasttName);
			driver.findElement(By.name(enter_firstName_under_AddEmployee)).sendKeys(firstName);
			Thread.sleep(3000);
			WebElement photo = driver.findElement(By.name("photofile"));
			photo.sendKeys("C:\\Users\\sekha\\OneDrive\\Desktop\\photo3naga.jpg");
			
			
			driver.findElement(By.id(btn_save_under_AddEmployee)).click();
			Thread.sleep(3000);
			Log.info("Add employee completed");
			//Exite from frame
			driver.switchTo().defaultContent();
			//Enter into frame
			//driver.switchTo().frame("rightMenu");
			//driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();//Related Xpath
			//driver.findElement(By.id("txtEmpLastName")).sendKeys("Sekhar");
			//driver.findElement(By.name("txtEmpFirstName")).sendKeys("Nagendra Babu");
			//Thread.sleep(3000);
			//driver.findElement(By.id("btnEdit")).click();
			//System.out.println("New Employee Added");
			//Thread.sleep(3000);
			//Exite from frame
			//driver.switchTo().defaultContent();
			

		}
		public void alerts_Or_Popups() throws Exception{
			driver.findElement(By.name(txt_loginname)).sendKeys(un);
			driver.findElement(By.name(btn_login)).click();
			Thread.sleep(3000);
			 Alert a = driver.switchTo().alert();
			 System.out.println(a.getText());
			  a.accept();
			  driver.findElement(By.name(txt_password)).sendKeys(pw);
			  Thread.sleep(3000);
			 driver.findElement(By.name(btn_login)).click(); 
			  Thread.sleep(3000);
			
		}
  public void keyboardActions()throws Exception {
	  driver.findElement(By.name(txt_loginname)).sendKeys(un);
	  driver.findElement(By.name(txt_password)).sendKeys(pw);
	  Robot r = new Robot();
	  r.keyPress(KeyEvent.VK_TAB);
	  r.keyRelease(KeyEvent.VK_TAB);
	  System.out.println("Tab");
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  System.out.println("Entetr");
	  driver.findElement(By.name(btn_login)).click(); 
	  Thread.sleep(3000);
	
	
	  
	  
  }
  
  public void getalloptions_dropdown()throws Exception{
	  
	  driver.switchTo().frame(0);
	  
	  Select st=new Select(driver.findElement(By.xpath("//*[@id=\"loc_code\"]")));
	  
	  List<WebElement> options=st.getOptions();
	  
	  for(WebElement all:options)
	  {
		  System.out.println(all.getText());
		  Log.info("All options retrieved:" + all.getText());
	  }
  driver.switchTo().defaultContent();
  }
  
  public void getall_links()throws Exception{
	  
	  
	  
	  
	  List<WebElement> all_links=driver.findElements(By.tagName("a"));
	  System.out.println("Here all the Application Links:");
	  
	  for(WebElement links: all_links)
	  {
		  System.out.println(links + links.getAttribute("href"));
		  Log.info("All links retrieved:"+ links + links.getAttribute("href"));
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
	}


