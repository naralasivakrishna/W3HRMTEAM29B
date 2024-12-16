package com_Steap_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

(
		features= "C:\\Users\\naral\\eclipse-workspace\\eclips projects\\W3HRM_BDD_Cucumber\\src\\test\\java\\com_Features\\Login.feature",
		glue= "com_Steap_Defination",
		tags="@smoke",
		plugin= {"pretty",
				"html:com_reports/newreport.html",
				"json:com_reports/newreport.json",
				"rerun:target/rerun.txt",
		}
		)

public class Steap_Runner {

}
