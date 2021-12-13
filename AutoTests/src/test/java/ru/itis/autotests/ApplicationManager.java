package ru.itis.autotests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.itis.autotests.helper.ContactHelper;
import ru.itis.autotests.helper.LoginHelper;
import ru.itis.autotests.helper.NavigationHelper;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors;
    JavascriptExecutor js;

    private NavigationHelper navigation;
    private LoginHelper auth;
    private ContactHelper contact;

    public ApplicationManager(){
        System.setProperty("webdriver.chrome.driver", "D:/Ahmedov/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.habitica.com/";
        verificationErrors = new StringBuffer();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        js = (JavascriptExecutor) driver;
        navigation = new NavigationHelper(this, baseUrl);
        auth = new LoginHelper(this);
        contact = new ContactHelper(this);
    }

    public NavigationHelper getNavigation() {
        return navigation;
    }

    public LoginHelper getAuth() {
        return auth;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void stop(){
        driver.quit();


    }
}