package ru.itis.autotests.helper;

import org.openqa.selenium.By;
import ru.itis.autotests.ApplicationManager;

public class RenameHelper extends HelperBase{

    public RenameHelper(ApplicationManager manager) {
        super(manager);
    }

    public void rename(String text){
        driver.findElement(By.xpath("//div[@id='app']/div[4]/div[3]/div/div/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div/div/div/div")).click();
        driver.findElement(By.xpath("//div[@id='app']/div[4]/div[3]/div/div/div[2]/div/div[2]/div[3]/div/div/div/div[2]/div/div/div/div[2]/div/div")).click();
        driver.findElement(By.xpath("//header[@id='task-modal___BV_modal_header_']/div/div[2]/input")).clear();
        driver.findElement(By.xpath("//header[@id='task-modal___BV_modal_header_']/div/div[2]/input")).sendKeys(text);
        driver.findElement(By.xpath("//header[@id='task-modal___BV_modal_header_']/div/div/div/button[2]/div")).click();

    }
}
