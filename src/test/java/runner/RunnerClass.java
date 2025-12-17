package runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utils.BaseUtils;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\sivajigroups\\src\\test\\resources\\featureFile", 
glue = {"stepdefinition", "hooks" },
//dryRun = true,
//strict = true,

//monochrome = true,
tags = "@login",
plugin = {
				"json:D:\\sivajigroups\\AllTestReport\\json-report\\reports1.json",
				"junit:D:\\sivajigroups\\AllTestReport\\junit-report\\reports2.xml"
}

		)
public class RunnerClass extends BaseUtils{
	@AfterClass
	public static void jvmReportGeneration() {
		JVMReport.jvmreport(
		"D:\\sivajigroups\\AllTestReport\\json-report\\reports1.json");


	}
}
