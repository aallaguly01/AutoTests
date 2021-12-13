package ru.itis.autotests.helper;

import org.openqa.selenium.WebDriver;
import ru.itis.autotests.ApplicationManager;

public class HelperBase{
    protected WebDriver driver;
    protected ApplicationManager manager;

    public HelperBase(ApplicationManager manager) {
        this.manager = manager;
        this.driver = manager.getDriver();
    }
}
