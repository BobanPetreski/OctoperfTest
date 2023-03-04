package com.company.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    /*
    By account = By.xpath("//*[@id=\"email\"]");
    */
    By email = By.xpath("//*[@id=\"mat-input-0\"]");

    By password = By.xpath("//*[@id=\"mat-input-1\"]");

    By loginButton = By.xpath("/html/body/app-root/app-access-page/div/div/div/app-login-form/form/lib-form-field-group/div/div[3]/div/button");

    

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }
    /*
    public void account() { driver.findElement(account).click();}
    */
    public void enterEmail() { driver.findElement(email).sendKeys("bosh.petreski@gmail.com"); }

    public void enterPassword() { driver.findElement(password).sendKeys("bobo0709"); }

    public void loginButton() { driver.findElement(loginButton).click(); }

}
