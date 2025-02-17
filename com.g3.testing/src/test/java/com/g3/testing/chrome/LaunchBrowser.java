package com.g3.testing.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver.get("https://letcode.in/");
		Thread.sleep(3000);
		
		driver.quit();
	}

}
