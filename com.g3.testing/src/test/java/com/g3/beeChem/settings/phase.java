package com.g3.beeChem.settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class phase {
	public phase addNewPhase(WebDriver driver) throws Exception{
		driver.findElement(By.xpath("//p[.='Phases']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='ADD NEW']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("phase_name")).sendKeys("ISHTECHDEVTEST");
		//phase cancel check
		driver.findElement(By.xpath("//button[.='CANCEL']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Cancel anyway']")).click();
		return this;


	}
	public phase addPhase(WebDriver driver) throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='ADD NEW']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("phase_name")).sendKeys("ISHTECHTEST");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='SAVE']")).click();
		//canceling by clicking x mark 
		//driver.findElement(By.xpath("//div[@class='MuiBox-root css-i3pgaz']//button[contains(@class,'MuiButtonBase-root')]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[.='Cancel anyway']")).click();
		System.out.println("Phase Saved Successfully");

		return this;
	}
	public phase deletePhase(WebDriver driver) throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.name("search")).sendKeys("ISHTECHTEST");		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-oqsqcn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul[contains(@class, 'MuiList-root MuiList-padding MuiMenu')]//li)[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Delete']")).click();
		Thread.sleep(1000);
		System.out.println("Phase Deleted Successfully");

		return this;
	}

}



