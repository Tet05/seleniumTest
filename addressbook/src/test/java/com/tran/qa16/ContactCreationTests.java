package com.tran.qa16;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
@Test
    public void testContactCreation() {

    initContactCreation();
    fillContactForm("123","kkk","lll");
    createContact()

}


}
