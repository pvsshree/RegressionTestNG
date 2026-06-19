package com.testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)	
@CucumberOptions(
		
		features = {"src/test/resources/appfeaturefile"},
		glue= {"stepdefinitions","ApplicationHooks"},
		plugin = {"pretty"} 
		
				)

public class MyTestRunner {
}
