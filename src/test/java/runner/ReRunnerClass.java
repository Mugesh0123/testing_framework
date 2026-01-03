package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\vinot\\git\\testing_framework\\src\\test\\resources\\rerun\\rerun.txt", 
glue = {"stepdefinition", "hooks" },
//dryRun = true,
//publish = true,

//monochrome = true,

plugin = {
				"json:C:\\Users\\vinot\\git\\testing_framework\\AllTestReport\\json-report\\reports1.json",
				"html:C:\\Users\\vinot\\git\\testing_framework\\AllTestReport\\html-report\\index.html",
				"junit:C:\\Users\\vinot\\git\\testing_framework\\AllTestReport\\junit-report\\reports2.xml",
				"rerun:C:\\Users\\vinot\\git\\testing_framework\\src\\test\\resources\\rerun\\rerun.txt"
})

public class ReRunnerClass {
	@AfterClass
	public static void jvmReportGeneration() {
			JVMReport.jvmreport("C:\\Users\\vinot\\git\\testing_framework\\AllTestReport\\json-report\\reports1.json");


	}
}
