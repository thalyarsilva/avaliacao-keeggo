package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/resources/Features"},
		glue = "",
		monochrome = true,
				plugin = { 	"pretty", "json:target/JSONReports/report.json"},
		tags =  	 		"@RealizarLogin")

public class Runner {

}

