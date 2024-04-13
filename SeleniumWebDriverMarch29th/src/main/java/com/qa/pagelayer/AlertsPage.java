package com.qa.pagelayer;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.LaunchBrowser;

public class AlertsPage extends LaunchBrowser {
	
	WebDriver driver;
	Actions action;
	
	@FindBy (xpath="//a[@href='Alerts.html']")
	WebElement alertLnk;
	
	@FindBy (xpath="//button[@class='btn btn-danger']")
	WebElement promptBtn;
	
	@FindBy (xpath="//a[text()='SwitchTo']")
	WebElement switchTomenu;
	
	public AlertsPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	public void hoverOnMenu() {
		action=new Actions(driver);
		action.moveToElement(switchTomenu).build().perform();
		
	}
	
	public void alertsMenu() throws Exception {
		action.click(alertLnk).build().perform();
		Thread.sleep(3000);
		String currentURL= driver.getCurrentUrl();
		System.out.println(currentURL);
		
	}
	
	
	public void promptAlert() {
		
		promptBtn.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	}


}
