package org.orange.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src//test//java//orangehrm.feature",glue="org.stepdefinition")
public class Orangerunner {

}
