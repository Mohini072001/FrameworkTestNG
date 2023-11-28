package com.saucedemo.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestScript_03 extends BaseTest {
	@Test
	public void filter()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		WebElement filter = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select s= new Select(filter);
		s.selectByValue("lohi");
		List<WebElement> price = driver.findElements(By.xpath(".//div[@class='inventory_item_price']"));
		for(int i=0;i<price.size();i++)
		{
		System.out.println("total no of price------"+price.get(i).getText());
	}
		driver.close();

	}
	

}
