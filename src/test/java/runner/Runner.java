package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



    @CucumberOptions(
            plugin = {
                    "pretty", "json:target/cucumber.json",},
            features = "src/test/java/features",
            glue = "stepdefinitions",
            tags = "@01_Platform",
            dryRun = false
            //
    )


    public class Runner extends AbstractTestNGCucumberTests {

    }

