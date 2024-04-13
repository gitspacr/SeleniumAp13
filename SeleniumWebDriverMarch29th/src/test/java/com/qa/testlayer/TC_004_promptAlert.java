package com.qa.testlayer;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.qa.pagelayer.AlertsPage;
import com.qa.pagelayer.LandingPage;
import com.qa.pagelayer.RegistrationPage;
import com.qa.pagelayer.WindowHandlePage;
import com.qa.testbase.LaunchBrowser;
import com.qa.testdata.ReadDataFromExcel;

public class TC_004_promptAlert extends LaunchBrowser{
	
	LandingPage lp;
	
	WindowHandlePage wp;
	
	AlertsPage ap;
	
	
	@Test
	public void toValidateNewWindows() throws Exception {
		lp=new LandingPage(driver);
		lp.clickOnskipSignin();
		ap=new AlertsPage(driver);
		ap.hoverOnMenu();
		ap.alertsMenu();
		ap.promptAlert();
		
	}
	
	
	
	
	
	
	
	
	

}
