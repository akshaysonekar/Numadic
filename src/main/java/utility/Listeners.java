package utility;


import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utility.NumadicElements;
public class Listeners extends NumadicElements implements ITestListener {

	public void onTestSucess(ITestResult result) {
		System.out.println("Test is suceessful"+result.getName());
		try {
			ScreenShot.takeScreenShot(driver,result.getName());
			}catch(IOException e) {
				e.printStackTrace();
			}
		
	}
	public void onTestFailure(ITestResult result) {
		
		try {
			ScreenShot.takeScreenShot(driver,result.getName());
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
	public void onTestSkip(ITestResult result) {
		
	}
	
	

}

	