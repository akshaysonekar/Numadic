package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	public static ExtentReports getReport() {
	ExtentSparkReporter sparkReporter = new ExtentSparkReporter("ExtenReports.html");
	ExtentReports extent =new ExtentReports();
	extent.attachReporter(sparkReporter);
	extent.setSystemInfo("RepotedBy", "Akshay");
	extent.setSystemInfo("TestType","Regression");

	return extent;
	}
}
