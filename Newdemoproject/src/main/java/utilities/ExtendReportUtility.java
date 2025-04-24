package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportUtility {
	public static final ExtentReports extentReports = new ExtentReports();

	public synchronized static ExtentReports createExtentReports() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
		reporter.config().setReportName("Newdemoproject");
		extentReports.attachReporter(reporter); //attaching two mthods object to create an report otherwiswe report can't generate
		extentReports.setSystemInfo("Organization", "Obsqura");
		extentReports.setSystemInfo("Name", "Reshma");// can be seen on top of the report
		extentReports.setSystemInfo("Name", "report1");
		return extentReports;// return an object / a report
	}

}
