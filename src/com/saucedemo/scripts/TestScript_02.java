package com.saucedemo.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestScript_02  extends BaseTest{

	@Test
	public void addToCart()
	{
		
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	driver.findElement(By.xpath(".//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	driver.findElement(By.xpath(".//a[@class='shopping_cart_link']")).click();
	WebElement cart_itm = driver.findElement(By.xpath(".//div[@class='cart_item']"));
	boolean tgt = cart_itm.isDisplayed();
	if(tgt)
	{
		System.out.println("Product added");
	}
	else
	{
		System.out.println("Product not added");

	}
	
	}
}

