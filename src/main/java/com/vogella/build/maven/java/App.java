package com.vogella.build.maven.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        System.out.println("Starting Testing------");
        File file = new File(System.getProperty("user.dir")+"/src/java/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Completed Testing------");

    }
}
