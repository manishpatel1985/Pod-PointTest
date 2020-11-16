package TestListeners;

import TestBase.BaseClass;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser extends BaseClass implements IRetryAnalyzer {

    int count = 0;
    int retrylimit = 2;

    public boolean retry(ITestResult arg0) {
        if(count<retrylimit) {
            count++;
            return true;
        }
        return false;
    }

}
