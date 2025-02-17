package com.g3.beeChem.settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.g3.beeChem.login;

public class phaseRule extends login {

	public phaseRule addPhaseRule(WebDriver driver) throws Exception {
		driver.findElement(By.xpath("//p[.='Phase Rules']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[.='ADD NEW']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='MuiBox-root css-1su8kau'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//ul[contains(@class,'MuiList-root')]//li)[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='MuiBox-root css-1su8kau'])[2]")).click();
		driver.findElement(By.xpath("(//ul[contains(@class,'MuiList-root')]//li)[3]")).click();
		driver.findElement(By.name("action")).sendKeys("TESTING");
		driver.findElement(By.id("show_mechanical")).click();
		return this;
	}}

