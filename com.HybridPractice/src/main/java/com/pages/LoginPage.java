package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button")
	WebElement loginBtn;
	
	@FindBy(tagName="img")
	WebElement logo;
	
	@FindBy(tagName="b")
	WebElement lable;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public  void loginApplication(String uname,String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
		
	}
	public boolean loginLogo() {
return logo.isDisplayed();		
		
	}
	public String logintitle() {
		String text=lable.getText();
		return text;
		
	}
	
}
