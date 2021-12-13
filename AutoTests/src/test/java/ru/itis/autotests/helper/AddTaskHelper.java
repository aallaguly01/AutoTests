package ru.itis.autotests.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import ru.itis.autotests.ApplicationManager;

import javax.swing.*;

public class AddTaskHelper extends HelperBase{

    public AddTaskHelper(ApplicationManager manager) {
        super(manager);
    }

    public void addTask(String text){
        driver.findElement(By.className("quick-add")).click();
        driver.findElement(By.className("quick-add")).sendKeys(text + Keys.ENTER);
    }
}
