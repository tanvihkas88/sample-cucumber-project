package com.nopcommerce.demo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Created by Jay Vaghani
 */

@CucumberOptions(
        features = "src/test/resources/features", //from src feature file
        glue = "com/nopcommerce/demo/steps", //folder path
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json"},
      tags = "@smoke"
)
public class RunCukeTest extends AbstractTestNGCucumberTests {


}
