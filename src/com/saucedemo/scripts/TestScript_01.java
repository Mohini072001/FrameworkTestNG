package com.saucedemo.scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript_01 extends BaseTest {
	@Test
	public void Login() 
	{
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

	}

}
