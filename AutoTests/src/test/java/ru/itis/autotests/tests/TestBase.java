package ru.itis.autotests.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.itis.autotests.ApplicationManager;
import ru.itis.autotests.data.AccountData;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;


public class TestBase{
    protected ApplicationManager app;

    @Before
    public void setUp() throws Exception {
        app = new ApplicationManager();
    }

    @After
    public void tearDown() throws Exception {
        app.stop();
    }

}
