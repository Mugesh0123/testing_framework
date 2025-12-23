package runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utils.BaseUtils;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\vinot\\git\\testing_framework\\src\\test\\resources\\featureFile", 
glue = {"stepdefinition", "hooks" },
//dryRun = true,
//strict = true,

//monochrome = true,
tags = "@verify_name",
plugin = {
				"json:C:\\Users\\vinot\\git\\testing_framework\\AllTestReport\\json-report\\reports1.json",
				"junit:C:\\Users\\vinot\\git\\testing_framework\\AllTestReport\\junit-report\\reports2.xml"
}

		)
public class RunnerClass {
	@AfterClass
public static void jvmReportGeneration() {
		JVMReport.jvmreport("C:\\Users\\vinot\\git\\testing_framework\\AllTestReport\\json-report\\reports1.json");


}
}
