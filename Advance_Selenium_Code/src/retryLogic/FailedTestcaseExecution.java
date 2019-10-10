package retryLogic;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestcaseExecution {
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test01() {
		Assert.assertEquals(false, true);;
	}
}
