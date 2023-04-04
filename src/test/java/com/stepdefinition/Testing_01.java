package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.Reusables;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Testing_01 extends Reusables {
	
	
	@Given("User is on Adactin")
	public void userIsOnAdactin() {
		
		 getDriver();
		 getUrl("https://adactinhotelapp.com/");	
	}

	@When("User should fill Username {string}")
	public void userShouldFillUsername(String string) {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(string);	
	
	}
	
	@When("User should fill Password {string}")
	public void userShouldFillPassword(String string) {
		WebElement user = driver.findElement(By.id("password"));
		user.sendKeys(string);	
	    
	}

	@When("User perform login")
	public void userPerformLogin() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	   
	}




}
