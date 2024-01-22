package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportListener implements ITestListener {

	private static final Logger logger = LoggerFactory.getLogger(ExtentReportListener.class);

	private static final ExtentReports extent = new ExtentReports();

	private static final ThreadLocal<ExtentTest> test = new ThreadLocal<>();

	static {
		ExtentSparkReporter spark = new ExtentSparkReporter("extent.html");
		extent.attachReporter(spark);
	}

	@Override
	public void onStart(ITestContext context) {
		logger.info("Start Of Execution(TEST)-> " + context.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test Started->" + result.getMethod().getMethodName());
		test.set(extent.createTest(result.getMethod().getMethodName()));
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test Pass->" + result.getName());
		test.get().pass("Test passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.error("Test Failed->" + result.getName(), result.getThrowable());
		test.get().fail(result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.warn("Test Skipped->" + result.getName());
		test.get().skip(result.getThrowable());
	}

	@Override
	public void onFinish(ITestContext context) {
		logger.info("End Of Execution(TEST)-> " + context.getName());
		extent.flush();
	}
	// Other ITestListener methods as needed

}