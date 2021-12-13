package ru.itis.autotests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.itis.autotests.helper.*;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors;
    JavascriptExecutor js;

    private NavigationHelper navigation;
    private LoginHelper auth;
    private ContactHelper contact;
    private AddTaskHelper addTask;
    private LogoutHelper logout;
    private RenameHelper rename;

    public ApplicationManager(){
        System.setProperty("webdriver.chrome.driver", "D:/Ahmedov/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.habitica.com/";
        verificationErrors = new StringBuffer();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        js = (JavascriptExecutor) driver;
        navigation = new NavigationHelper(this, baseUrl);
        auth = new LoginHelper(this);
        addTask = new AddTaskHelper(this);
        contact = new ContactHelper(this);
        rename = new RenameHelper(this);
        logout = new LogoutHelper(this);
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

    public AddTaskHelper getAddTask(){
        return addTask;
    }

    public RenameHelper getRename(){
        return rename;
    }

    public LogoutHelper getLogout(){
        return logout;
    }

    public void stop(){
        driver.quit();
    }
}
