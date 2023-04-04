package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.Reusables;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Excel extends Reusables{
	
	@Given("User is on Adaction HomePage")
	public void userIsOnAdactionHomePage() {
	 getDriver();
	 getUrl("https://adactinhotelapp.com/");
	
	}
	@When("User Should Enter ValidData {string} and {string}")
	public void userShouldEnterValidDataAnd(String username, String password) throws IOException {
	   
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(getDataFromExcel("Ganesh", 1, 0));
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(getDataFromExcel("Ganesh", 1, 1));
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
	}



	
	



}
