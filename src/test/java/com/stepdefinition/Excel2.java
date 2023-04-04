package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.Reusables;

import io.cucumber.java.en.When;

public class Excel2 extends Reusables{

	
	
	@When("User Should Enter ValidData {string}, {int} , {int} and {int}")
	public void userShouldEnterValidDataAnd(String SheetName, Integer RowNumber, Integer username, Integer password) throws IOException {
	   
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(getDataFromExcel(SheetName, RowNumber, username));
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(getDataFromExcel(SheetName, RowNumber, password));
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		
		
		
	}









}
