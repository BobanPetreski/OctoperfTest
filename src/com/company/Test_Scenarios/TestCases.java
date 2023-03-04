package com.company.Test_Scenarios;
import com.company.Objects.LoginPage;
import com.company.Objects.OcctoprefHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {
    WebDriver driver;

    @BeforeTest
    public void beforetest() throws InterruptedException {

    //Setup Chrome driver
    System.setProperty("webdriver.chrome.driver", "C:/Users/Boban/Downloads/chromedriver_win32/chromedriver.exe");
    driver = new ChromeDriver();

    //Get unique address of Chrome browser
    System.out.println(driver.getWindowHandle());

    //Navigate to Octopref.com
    driver.get("https://octoperf.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);

    //Get Website Title
    System.out.println(driver.getTitle());
    }

    //Click get stardet button
    @Test
    public void GetStarted() throws InterruptedException {
    OcctoprefHomePage home = new OcctoprefHomePage(driver);
    home.occtoprefhome();

    //Switch to New tab in some browser
     driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
    }

    //Enter Username and Password and click login button
    @Test
    public void LoginPage() throws InterruptedException {
    Thread.sleep(5000);
    LoginPage login = new LoginPage(driver);
    login.enterEmail();
    Thread.sleep(2000);
    login.enterPassword();
    Thread.sleep(2000);
    login.loginButton();
    Thread.sleep(2000);
    }

    //Close Chrome driver
    @AfterTest
    public void aftertest() {
    driver.quit();
    }

}