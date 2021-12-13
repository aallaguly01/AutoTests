package ru.itis.autotests.helper;

import ru.itis.autotests.ApplicationManager;

import static org.junit.Assert.fail;


public class NavigationHelper extends HelperBase{

    private String baseUrl;

    public NavigationHelper(ApplicationManager manager, String baseUrl) {
        super(manager);
        this.baseUrl = baseUrl;
    }

    public void openLoginPage() {
        driver.get("https://habitica.com/login");
    }
    public void openHomePage(){
        driver.get(baseUrl);
    }
}
