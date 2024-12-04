package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsLogin 
{
	
	public DwsLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
 @FindBy(className  ="ico-login")
private  WebElement login_link;
 
 @FindBy(id = "Email")
private WebElement email;
 
 @FindBy(name = "Password")
 private WebElement password;
 
 @FindBy(css = "input[name='RememberMe']")
 private WebElement remember_me;
 
 @FindBy(xpath = "//input[@value='Log in']")
 private WebElement login_button;
 
// public void loginLink(){
//	 login_link.click();
// }
// public void email1(String data) {
//	 email.sendKeys(data);
// }
// public void password1(String data) {
//	 password.sendKeys(data);
// }
// public void rememberMe() {
//	 remember_me.click();
// }
// public void loginButton() {
//	 login_button.click();
// }
 
 public void login(String email1, String password1) {
	 login_link.click();
	 email.sendKeys(email1);
	 password.sendKeys(password1);
	 remember_me.click();
	 login_button.click();
	 
 }
 
}
