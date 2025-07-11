package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Magicbricks {
	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.magicbricks.com");

        List<WebElement> anchors = driver.findElements(By.tagName("a"));

        System.out.println("Links containing 'uy':");
        for (WebElement anchor : anchors) {
            String text = anchor.getText().toLowerCase();
            if (text.contains("uy")) 
            {
                System.out.println(text);
            }
        }

        driver.quit();
    }
}



