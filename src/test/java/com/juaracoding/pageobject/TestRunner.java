package com.juaracoding.pageobject;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
				features = "src/test/resources/features/Checkout.feature",
				glue = "com.juaracoding.pageobject",
				plugin = {"pretty", "html:target/cucumber-reports.html","json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
