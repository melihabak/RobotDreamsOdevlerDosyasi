package org.example;

import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class AllureTest {
    @BeforeTest
    public void beforeCall(){
        System.out.println("This is before test method");
    }
    @Step("Test case 001")
    @Test(priority = 1)
    public void testCase1(){
        System.out.println("This is test case1");
    }
    @Step("Test case 002")
    @Test(priority = 2)
    public void testCase2(){
        System.out.println("This is test case2");
    }
    @Step("Test case 003")
    @Test(priority = 3)
    public void testCase3(){
        System.out.println("This is test case3");
        Assert.assertTrue(true);
    }
    @AfterTest
    public void tearDown(){
        System.out.println("This is after test method");
    }
}
