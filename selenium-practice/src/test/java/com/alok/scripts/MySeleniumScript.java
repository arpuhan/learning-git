package com.alok.scripts;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class MySeleniumScript {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\puhan\\eclipse-workspace\\selenium-practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://googlechromelabs.github.io/chrome-for-testing/");
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
