package listeners;

import org.testng.*;

import java.util.Date;


/**
 * Created by Viktoriia_Marynchak on 11/1/2016.
 */
public class ListenerClass implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {}

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        Reporter.log("</br>" + (new Date(System.currentTimeMillis())) + "Test passed: " +
                "[" + iTestResult.getTestContext().getName() + "]" +
                "[" + iTestResult.getTestClass().getName() + "]" +
                "[" + iTestResult.getName() + "]. " +
                "Status <" + iTestResult.getStatus() + ">. " +
                "Time duration <" + (iTestResult.getEndMillis() - iTestResult.getStartMillis()) + ">.");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        Reporter.log("</br>" + (new Date(System.currentTimeMillis()))+ "Test faild: [ " +
                "[" + iTestResult.getClass().getSimpleName() + "]" +
                "[" + iTestResult.getMethod().getMethodName() + "]. " +
                "Status <" + iTestResult.getStatus() + ">. " +
                "Time duration <" + (iTestResult.getEndMillis() - iTestResult.getStartMillis()) + ">.");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
