package Test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(SuiteClass.class);
		System.out.println();
		System.out.println("Successful: " + result.wasSuccessful());
		System.out.println();
		System.out.println("Total: " + result.getRunCount());
		System.out.println("Ignored: " + result.getIgnoreCount());
		System.out.println("Failed: " + result.getFailureCount());
		System.out.println();
		for(Failure fail : result.getFailures()) {
			System.out.println(fail.toString());
		}
		System.out.println();
		System.out.println("Total run time: " + result.getRunTime());
	}
}
