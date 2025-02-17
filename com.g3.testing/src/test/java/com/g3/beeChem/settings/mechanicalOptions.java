package com.g3.beeChem.settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.g3.beeChem.login;

public class mechanicalOptions extends login{

	public void mechanicalOptionsSelect(WebDriver driver) throws Exception {
		driver.findElement(By.xpath("//p[.='Mechanical Options']")).click();
		Thread.sleep(1000);
	}
	public void addNewMechanicalOptions(WebDriver driver) throws Exception {
		driver.findElement(By.xpath("//button[.='ADD NEW']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("name")).sendKeys("PowDered sugar for TESTING");
		Thread.sleep(1000);
		driver.findElement(By.name("main_advantage")).sendKeys("TESTING Up to 20% of mite naturally fall off the frames.  Adding things like Vegetable oil or Diatomaceous Earth to assist the destruction of the mites is beneficial.");
		Thread.sleep(1000);
		driver.findElement(By.name("timing")).sendKeys("All year round application for TEST");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='SAVE']")).click();
		System.out.println("Mechanical Options Saved Successfully");

	}
	public void deleteMechOptions(WebDriver driver) throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.name("search")).sendKeys("TESTING Up to ");		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-oqsqcn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul[contains(@class, 'MuiList-root MuiList-padding MuiMenu')]//li)[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Delete']")).click();
		Thread.sleep(1000);
		System.out.println("Mechanical Options Deleted Successfully");
	
	}
}
