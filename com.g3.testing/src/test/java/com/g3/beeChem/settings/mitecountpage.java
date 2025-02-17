package com.g3.beeChem.settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.g3.beeChem.login;

public class mitecountpage extends login {


	public  mitecountpage  mitecancel(WebDriver driver) throws Exception
	{

		//mitecount
		driver.findElement(By.xpath("//button[.='ADD NEW']")).click();
		int count = 1000;
		driver.findElement(By.name("mite_count")).sendKeys("1000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='CANCEL']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Cancel anyway']")).click();
		return this;

	}

	public mitecountpage addMiteCount(WebDriver driver) throws Exception {
		driver.findElement(By.xpath("//button[.='ADD NEW']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("mite_count")).sendKeys("1000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='SAVE']")).click();
		System.out.println("Mite Count Added successfully");
		return this;
	}

	public chemicalOptions deleteMiteCount(WebDriver driver) throws Exception {
		driver.findElement(By.xpath("(//div[@class='MuiBox-root css-oqsqcn'])[5]")).click();
		driver.findElement(By.xpath("(//ul[contains(@class, 'MuiList-root MuiList-padding MuiMenu')]//li)[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Delete']")).click();
		Thread.sleep(1000);
		System.out.println("Mite Count Deleted successfully");
		return new chemicalOptions();

	}




}
