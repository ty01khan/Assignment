package Test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * 
 * @author Talha Yaseen
 * 
 * This is test runner class which runs Suite class
 *
 */
public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(SuiteClass.class);
		System.out.println();
		
		// wasSuccessful():  checks whether the all test cases are successfully executed or not
		System.out.println("Successful: " + result.wasSuccessful());
		System.out.println();
		
		// getRunCount(): checks how many total test cases are tested
		System.out.println("Total: " + result.getRunCount());
		
		// getIgnoreCount(): checks how many test cases are annotate with @Ignore
		System.out.println("Ignored: " + result.getIgnoreCount());
		System.out.println();
		
		// getFailureCount(): checks how many test cases are failed
		System.out.println("Failed: " + result.getFailureCount());
		
		// fail.toString(): returns a reason why the test cases are failed
		for(Failure fail : result.getFailures()) {
			System.out.println(fail.toString());
		}
		System.out.println();
		
		// getRunTime(): it returns the total run time taken on the execution
		System.out.println("Total run time: " + result.getRunTime());
	}
}
