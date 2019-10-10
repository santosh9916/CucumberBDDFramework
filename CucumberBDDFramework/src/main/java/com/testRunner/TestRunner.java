package com.testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

/*
CucumberOptions are in runner file:
features   - the path of the .feature file
glue       - the path of the step definition file
format     - to generate different types of reporting
monochrome - it will check if any step is not defined in step definition file
dryRun     - to check the mapping is proper between feature file & step definition file
*/

@CucumberOptions(features = "/Users/santoshbihari.m/eclipse-workspace/CucumberBDDFramework/src/main/java/com/features/login.feature", 
		glue = {"com.stepDefination" }, 
        format = {"pretty", "html:test-output" }, 
        monochrome = true, 
		dryRun = false  
		)
public class TestRunner {

}
