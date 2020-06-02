package Listener_layer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listenertest  implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("start of test case "+result.getName() );

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed : "+result.getName() );
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed: "+result.getName() );
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped: "+result.getName() );
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

        System.out.println("start of execution "+context.getName());
        System.out.println("directory of project: "+context.getOutputDirectory());

    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("execution of "+context.getName() +" ended");
        System.out.println("Test cases passed: "+context.getPassedTests());
        System.out.println("Test cases failed: "+context.getFailedTests());

    }
}
