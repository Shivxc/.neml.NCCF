package Pages;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.internal.annotations.IListeners;

public class Listener extends Takescreenshot1 implements ITestListener{

	public void OnTestStart(ITestResult result) {
		System.out.println("test started");
		Reporter.log("this is test started with reporter log");
	}
	
	public void OnTestFinish(ITestResult result) {
	try {
		Takescreenshot();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
		
		
	}
	

}
