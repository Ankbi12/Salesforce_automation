package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/main/java/features/Testcase_1.feature",glue="stepdep")

public class Execution extends AbstractTestNGCucumberTests{

}

