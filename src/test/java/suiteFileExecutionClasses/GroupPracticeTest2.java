package suiteFileExecutionClasses;

import org.testng.annotations.Test;

public class GroupPracticeTest2 {

	@Test(groups = "smoke")
	public void group3() {
		System.out.println("SMOKE--3");
	}
	
	@Test(groups = "regression")
	public void group4() {
		System.out.println("REGRESSION--4");
	}

}
