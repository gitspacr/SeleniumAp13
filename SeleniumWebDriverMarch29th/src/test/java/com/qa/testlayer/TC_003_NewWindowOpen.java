package com.qa.testlayer;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.qa.pagelayer.LandingPage;
import com.qa.pagelayer.RegistrationPage;
import com.qa.pagelayer.WindowHandlePage;
import com.qa.testbase.LaunchBrowser;
import com.qa.testdata.ReadDataFromExcel;

public class TC_003_NewWindowOpen extends LaunchBrowser{
	
	LandingPage lp;
	
	WindowHandlePage wp;
	
	@Test
	public void toValidateNewWindows() throws Exception {
		lp=new LandingPage(driver);
		lp.clickOnskipSignin();
		wp=new WindowHandlePage(driver);
		wp.hoverOnMenu();
		wp.winSubMenu();
		screenshot(driver,"windowScreenDisplay");
		log.info("Windows screendisplay");
		wp.clickOnNewWindow();
		wp.windowHandle();
		screenshot(driver,"separateWindow");
		log.info("separate window screendisplay");
	}
	
	
	
	
	
	
	
	
	

}
