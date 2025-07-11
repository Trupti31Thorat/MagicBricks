package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task extends BasePage {
	 Task(WebDriver driver) {
		super(driver);
	}
	
        List<WebElement> anchors = driver.findElements(By.tagName("a"));
        for (WebElement anchor : anchors) {
            String text = anchor.getText().toLowerCase();
            if (text.contains("er")) {
                System.out.println(text);
            }
        }

     
    }

//inthowhere.com