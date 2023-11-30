package suiteFileExecutionClasses;

import org.testng.annotations.Test;

public class GroupPracticeTest1 {

	@Test(groups = "smoke")
	public void group1() {
		System.out.println("SMOKE--1");
	}
	
	@Test(groups = "regression")
	public void group2() {
		System.out.println("REGRESSION--2");
	}
}
