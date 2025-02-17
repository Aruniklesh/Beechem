package com.g3.beeChem.settings;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.g3.beeChem.login;

public class chemicalOptions extends login {
	public chemicalOptions chemicalOptionsSelect(WebDriver driver) throws Exception {
		driver.findElement(By.xpath("//p[.='Chemical Options']")).click();
		Thread.sleep(1000);
		return this;

	}
	public chemicalOptions addnewChemicalOption(WebDriver driver) throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='ADD NEW']")).click();
		Thread.sleep(1000);
		//productname
		driver.findElement(By.name("product_name")).sendKeys("ISHTech");
		//selectgroup
		Thread.sleep(1000);
		System.out.println("------------------------------------------");
		driver.findElement(By.id("mui-component-select-group_id")).click();
		String optionToSelectGroup = "Oxalic";
		List<WebElement> groupNames = driver.findElements(By.xpath("//ul[contains(@class,'MuiList-root MuiList-padding MuiMenu-list')]/li"));

		boolean isSelected = false;
		Thread.sleep(2000);
		for (WebElement names : groupNames) {
			String singleName = names.getText();
			System.out.println("Options Found: " + singleName); // Debugging

			if (singleName.equalsIgnoreCase(optionToSelectGroup)) {
				names.click();
				isSelected = true;
				break;

			}
		}
		System.out.println("------------------------------------------");
		if (isSelected) {
			System.out.println(optionToSelectGroup+ "  is selected.");
		}
		else {
			System.out.println(optionToSelectGroup+ "  is not selected.");

		}

		//registration status
		driver.findElement(By.name("registration_status")).sendKeys("APVMA ISHTEST94609");

		//activeingredient
		driver.findElement(By.name("active_ingredient")).sendKeys("62g/L Oxalic Acid Dihydrate TEST");
		//Templist
		driver.findElement(By.name("chemical_type")).sendKeys("Oxalic Acid Extract TEST");
		//dosage
		driver.findElement(By.name("dosage")).sendKeys("Fogging:  2.3 grams per brood, Dribbling: 5ml per frame TEST");
		//TempList
		driver.findElement(By.name("temp_list")).sendKeys("Not Critical TEST");
		//Superson
		//driver.findElement(By.xpath("//li[contains(@class,'MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root')]")).click();
		//treatmenttime
		driver.findElement(By.name("treatment_time")).sendKeys("5 days TEST");

		Thread.sleep(2000);

		//to check the upload of the document
		driver.findElement(By.xpath("(//div[@class='MuiBox-root css-15pyhu0'])[1]")).click(); 
		//C:\Users\i5-11th Gen\Downloads 
		Thread.sleep(1000);
		String file ="C:\\Users\\i5-11th Gen\\Downloads\\treatment_inspection.pdf";
		
		StringSelection select = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);

		Robot robot = new Robot(); 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER); 
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='SAVE']")).click();
		Thread.sleep(1000);
		System.out.println("Chemical Options Saved Successfully");
		return this;

	}
	public void deleteChemicalOptions(WebDriver driver) throws Exception {
		driver.findElement(By.name("search")).sendKeys("ISHTech");		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='MuiBox-root css-oqsqcn']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//ul[contains(@class, 'MuiList-root MuiList-padding MuiMenu')]//li)[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Delete']")).click();
		Thread.sleep(1000);
		System.out.println("Chemical Options Deleted Successfully");
		System.out.println("---------------------------------------------");

	}

}
