package com.ActiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LonginPage
{
	@FindBy(id="username")
	private WebElement ustbx;
	@FindBy(name="pwd")
	private WebElement pwdtbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement logbtn;
	
	public LonginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setlogin(String un,String pw)
	{
		ustbx.sendKeys(un);
		pwdtbx.sendKeys(pw);
		logbtn.click();
	}

}
