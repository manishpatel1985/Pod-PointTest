package TestListeners;

import TestBase.BaseClass;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyTransformer extends BaseClass implements IAnnotationTransformer {

    public void transform(ITestAnnotation annotation,Class class1,Constructor constructor,Method method) {
        annotation.setRetryAnalyzer(RetryAnalyser.class);
    }

}