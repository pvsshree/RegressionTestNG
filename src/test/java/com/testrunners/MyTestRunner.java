package com.testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)	
@CucumberOptions(
		
		features = {"src/test/resources/appfeaturefile/LoginPage.feature"},
		glue= {"com.stepdefinitions","com.apphooks"},
		plugin = {"pretty"} 
		
				)

public class MyTestRunner {
}
