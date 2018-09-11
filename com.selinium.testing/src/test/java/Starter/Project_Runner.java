package Starter;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src//test//java//Features"},glue= {"Implementation"},plugin= {"pretty","html:target/cucumber"})

@Test

public class Project_Runner extends AbstractTestNGCucumberTests {

}
