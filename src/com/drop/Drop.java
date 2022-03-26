package com.drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\DropDown\\dri\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		WebElement d1 = driver.findElement(By.id("fruits"));
		Select s = new Select(d1);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.deselectAll();
		
	}

}
