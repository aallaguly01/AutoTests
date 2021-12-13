package ru.itis.autotests.helper;

import org.openqa.selenium.By;
import ru.itis.autotests.ApplicationManager;
import ru.itis.autotests.data.AccountData;

public class LoginHelper extends HelperBase{

    public LoginHelper(ApplicationManager manager) {
        super(manager);
    }

    public void login(AccountData user) {
        driver.findElement(By.id("usernameInput")).click();
        driver.findElement(By.id("usernameInput")).clear();
        driver.findElement(By.id("usernameInput")).sendKeys(user.getUsername());
        driver.findElement(By.id("passwordInput")).clear();
        driver.findElement(By.id("passwordInput")).sendKeys(user.getPassword());
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
