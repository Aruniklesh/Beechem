package com.g3.beeChem;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.g3.beeChem.settings.chemicalOptions;
import com.g3.beeChem.settings.groups;
import com.g3.beeChem.settings.mechanicalOptions;
import com.g3.beeChem.settings.mitecountpage;
import com.g3.beeChem.settings.phase;
import com.g3.beeChem.settings.phaseRule;

public class login {
	@Test
	public void login() throws Exception {
		WebDriver driver = null;
		//implementing small case framework
		FileInputStream file = new FileInputStream("config.properties");
		Properties property = new Properties();
		property.load(file);

		String browser = property.getProperty("browser");
		String driverlocation = property.getProperty("driverlocation");
		String username = property.getProperty("username");
		String password = property.getProperty("password");


		//chrome browser
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverlocation);
			driver = new ChromeDriver();

		}
		//maximize window
		driver.manage().window().maximize();

		driver.navigate().to("https://app.beechem.com.au/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);
		//remember me check
		boolean remember = driver.findElement(By.id("Remember")).isSelected();
		if (remember==true) {
			System.out.println("Remember me button is selected");
		}
		else {
			System.out.println("Remember me button is not selected");
		}
		//forgot password redirect check
		driver.findElement(By.xpath("//*[.='forgot password?']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		//login credentials
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[.='Login']")).click();

		WebElement heading = driver.findElement(By.xpath("//*[.=' Users Details']"));
		String text = heading.getText();
		if (text.equals("Users Details")) {
			System.out.println("Log in Successfull");
		}
		else {
			System.out.println("Log in UN- Successfull");

		}

		//mitecount
		mitecountpage log = new mitecountpage();
		log.settingSelect(driver);
		//log.mitecancel(driver);
		//log.addMiteCount(driver);
		//log.deleteMiteCount(driver);

		//phase
		//phase phase = new phase();
		//phase.addNewPhase(driver);
		//phase.addPhase(driver);

		//groups
		//groups group = new groups();
		//group.addNewGroup(driver);
		//group.deleteGroupBySearch(driver);
		
		//chemical options	
		//chemicalOptions che = new chemicalOptions();
		//che.chemicalOptionsSelect(driver);
		//che.addnewChemicalOption(driver);
	//	che.deleteChemicalOptions(driver);

		//mechanicaloptions
		//mechanicalOptions mech = new mechanicalOptions();
		//mech.mechanicalOptionsSelect(driver);
		//mech.addNewMechanicalOptions(driver);
		//mech.deleteMechOptions(driver);

		
		//phaserules
		//phaseRule rule = new phaseRule();
		//rule.addPhaseRule(driver);
		
		

	}


}
