package com.loginparameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Sprint {

	    public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.magicbricks.com"); 

	        List<WebElement> anchors = driver.findElements(By.tagName("a"));

	        System.out.println("Links containing 'vi':");
	        for (WebElement anchor : anchors) {
	            String text = anchor.getText().toLowerCase();
	            if (text.contains("vi")) {
	                System.out.println(text);
	            }
	        }

	    }
	}
