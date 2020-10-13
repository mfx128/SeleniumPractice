package com.GroupNumberOne.Day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Practice1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new SafariDriver();
        driver.get("https://www.youtube.com/watch?v=SQIEni4MMEA");
    }
}
