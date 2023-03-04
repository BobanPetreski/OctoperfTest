package com.company.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OcctoprefHomePage {

    WebDriver driver;

    public OcctoprefHomePage(WebDriver driver) {
        this.driver = driver;
    }

    By getstarted = By.xpath("//*[@id=\"navBar\"]/div/ul/li[6]/a");

    public void occtoprefhome() {
        driver.findElement(getstarted).click();
    }

}
