package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.LoginPage;

public class LoginTest extends BaseClass {

	
	public static WebDriver driver;
	LoginPage lp;
	@BeforeSuite
	public void setUp() {
		log.info("inside the before suite ");
	driver= initilization();
	reportInit();
	lp=new LoginPage(driver);
}
	@Test(priority=4)
	public void loginApp() {
		lp.loginApplication("kiran@gmail.com","123456" );
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		
	}
	@Test(priority=1)
	public void loginTitle() {
		log.info("executing a test for loginTitle");
		Assert.assertEquals(driver.getTitle(),"JavaByKiran | Log in");
		
	}
	@Test(priority=2)
	public void loginLogo() {
	/*	log.info("executing a test for loginLogo");
		WebElement logo=driver.findElement(By.tagName("img"));*/
		
		Assert.assertTrue(lp.loginLogo());
		
	}
	@Test(priority=3)
	public void loginLable() {
		/*log.info("executing a test for loginLable");
		WebElement lable=driver.findElement(By.tagName("b"));
		String text=lable.getText();
		throw new SkipException("skip test");*/
		Assert.assertEquals(lp.logintitle(),"Java By Kiran" );
	}
	
	
}