package com.alok.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://form-bot-anvsystems.pages.dev/");
		selenium1 se = new selenium1();
		se.typeIntoInputbox(driver, By.name("firstname"),"Alok");
		driver.findElement(By.name("firstname")).sendKeys("Alok");
		driver.findElement(By.name("lastname")).sendKeys("puhan");
		driver.findElement(By.name("email")).sendKeys("puhanalok1@gmail.com");
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.name("phone")).sendKeys("98764231");
		Select select = new Select(driver.findElement(By.name("country")));
		select.selectByVisibleText("India");
		driver.findElement(By.name("programming")).click();
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
	}
	public void typeIntoInputbox(WebDriver driver ,By locator, String valueToType) {
		driver.findElement(locator).sendKeys(valueToType);		
	}
	public void clickElement(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}
}
