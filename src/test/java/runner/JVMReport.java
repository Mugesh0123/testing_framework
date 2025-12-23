package runner;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void jvmreport(String json) {
		File file = new File("C:\\Users\\vinot\\git\\testing_framework\\AllTestReport\\jvm-report");
		Configuration config = new Configuration(file,"jvmreports");		
		
		config.addClassifications("Project Name", "Sivaji Groups");
		config.addClassifications("Tester Name", "Arsath");
		config.addClassifications("Build Verion", "V1.0.0");
		List<String> list = new ArrayList<String>();
		list.add(json);
		ReportBuilder reportMaking = new ReportBuilder(list,config);
		reportMaking.generateReports();
		
		

	}

}
