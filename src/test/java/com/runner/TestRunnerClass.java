package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
	//tags="@Excel2",
	tags="@testing_01",
dryRun=false,snippets=SnippetType.CAMELCASE,features= "C:\\Users\\User\\eclipse-workspace\\CucumberWithExcel\\src\\test\\resources",glue= "com.stepdefinition")


public class TestRunnerClass {

	
}
