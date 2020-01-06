package com.vogella.build.maven.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class TestOne {

    public static void main(String[] args)throws Exception{

        //WebDriverManager.chromedriver().setup();
        System.out.println("Starting Testing------");
        File file = new File(System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Completed Testing------");
    }
}