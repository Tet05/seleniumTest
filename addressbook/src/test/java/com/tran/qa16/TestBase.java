package com.tran.qa16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    @BeforeMethod

    public  void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
        wd.get("http://localhost/addressbook/addressbook/");
        login("admin","secret");



    }

    private void login(String user, String password) {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(   "admin");


        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(   "secret");

        wd.findElement(By.xpath("//*[@value = 'Login']")).click();


    }

    @AfterMethod
        public void tearDown() {
            wd.quit();
    }

    protected void createContact() {
    wd.findElement(By.name("submit")).click();
    }

    protected void initContactCreation() {
        wd.findElement(By.name("edit")).click();
    }

    protected void fillContactForm(ContactData contactData){
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys("firstname");

    wd.findElement(By.name("lastname")).click();
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys("lastname");

    wd.findElement(By.name("address")).click();
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys("address");




}
}
