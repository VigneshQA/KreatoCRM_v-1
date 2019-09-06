package com.kreatocrm.pageobjects;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="Login_txtUserName")
	@CacheLookup
	WebElement UserName;
	
	@FindBy(id="Login_txtPassword")
	@CacheLookup
	WebElement Password;
	
	@FindBy(id="Login_btnLogin")
	@CacheLookup
	WebElement Login;
	
	@FindBy(linkText="Forgot your password?")
	@CacheLookup
	WebElement ForgotPass;
	
	@FindBy(id="ctl00_imgEmp")
	@CacheLookup
	WebElement UserInfo;
	
	@FindBy(id="ctl00_lnkLogOut")
	@CacheLookup
	WebElement Logout;
	
	@FindBy(id="ForgotPassword1_txtEmailAddress")
	@CacheLookup
	WebElement ForgotMail;
	
	@FindBy(id="ForgotPassword1_btnSendPwdToEmail")
	@CacheLookup
	WebElement SubmitFMail;
	
	@FindBy(id="ForgotPassword1_Button2")
	@CacheLookup
	WebElement CancelFmail;
	
	@FindBy(xpath="//span[text()='Ok']")
	@CacheLookup
	WebElement MultiloginOK;
	
	@FindBy(xpath="//span[text()='Cancel']")
	@CacheLookup
	WebElement MultiloginCancel;	
	
		
	
	public void setUserName(String uname){
		UserName.sendKeys(uname);
	}
	
	public void ClearUserName(){
		UserName.clear();
	}
	
	public void setPassword(String pass){
		Password.sendKeys(pass);
	}
	
	public void ClearPassword(){
		Password.clear();
	}
	
	public void clicklogin(){
		Login.click();
	}
	
	public void clickuserinfo(){
		UserInfo.click();
	}
	
	public void clicklogout(){
		Logout.click();
	}
	
	public void forgotmail(String forgotmail){
		ForgotMail.sendKeys(forgotmail);
	}
		
	public void clickforgotpass(){
		ForgotPass.click();
	}
	
	public void clicksubmitfmail(){
		SubmitFMail.click();
	}
	
	public void clickcancelfmail(){
		CancelFmail.click();
	}
	
	public void clickmultiloginok(){
		MultiloginOK.click();
	}
	
	public void clickmultilogincancel(){
		MultiloginCancel.click();
	}
	
	public boolean isMutiLogPopPresent() 
	{
		try
		{
			MultiloginOK.getSize();
			return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}
	
}
