package tests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(AllCalculatorTest.class,AllMyNumberTest.class);
        System.out.println("Successful:"+result.wasSuccessful());
        System.out.println("Total:"+result.getRunCount());
        System.out.println("Ignored:"+result.getIgnoreCount());
        System.out.println("Failed:"+result.getFailureCount());
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}