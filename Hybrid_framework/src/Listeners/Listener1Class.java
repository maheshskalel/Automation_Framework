package Listeners;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class Listener1Class implements ITestListener    //Listnerclass
{
	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("tc execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("tc successfully exe");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("tc failed to exec");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("skipped tc");
	}

}
