package sampleTest.Base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.net.MalformedURLException;

public class TestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result){
        String platform = result.getMethod().getXmlTest().getLocalParameters().get("platform");

        if(platform.contains("android")){
            try {
                AppFactory.Android_LaunchApp();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }else if(platform.contains("ios")){
            try {
                AppFactory.iOS_LaunchApp();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        tearDown();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        tearDown();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        tearDown();
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }

    public void tearDown(){
        AppDriver.getDriver().quit();
    };
}
