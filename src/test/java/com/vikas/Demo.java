package com.vikas;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {

	WebDriver driver;

	@Parameters("browser")
	@Test
	public void doWalk(@Optional("default browser") String browser) {

		driver.get("https://www.google.co.in/");
		WebElement ele = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		ele.sendKeys("vikas");

		ele.sendKeys(Keys.ENTER);
		
		System.out.println("==================================================================================================");
		System.out.println("Browser Name: " + browser);
		System.out.println("==================================================================================================");

	}

	@Test
	public void enterText() {

		driver.get("https://www.google.co.in/");
		WebElement ele = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		ele.sendKeys("jAGALI");

		ele.sendKeys(Keys.ENTER);
	}

	@BeforeMethod
	public void init() {

		driver = new ChromeDriver();

	}

	@AfterMethod
	public void teardown() throws InterruptedException {

		Thread.sleep(Duration.ofSeconds(4));
		driver.quit();
	}

}
