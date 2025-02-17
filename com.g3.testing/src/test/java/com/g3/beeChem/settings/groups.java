package com.g3.beeChem.settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.g3.beeChem.login;

public class groups extends login{

	public void addNewGroup(WebDriver driver) throws Exception {
		driver.findElement(By.xpath("//p[.='Groups']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='ADD NEW']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("group_name")).sendKeys("ZSHTECHGROUP");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='SAVE']")).click();
		Thread.sleep(1000);
		System.out.println("Groups Saved Successfully");
		
	}
	public void deleteGroupBySearch(WebDriver driver) throws Exception {
		//driver.findElement(By.xpath("//p[.='Groups']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("search")).sendKeys("ZSHTECHGROU");		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='MuiBox-root css-oqsqcn']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//ul[contains(@class, 'MuiList-root MuiList-padding MuiMenu')]//li)[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Delete']")).click();
		Thread.sleep(1000);
		System.out.println("Groups Deleted Successfully");


	}}
