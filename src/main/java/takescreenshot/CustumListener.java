package takescreenshot;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustumListener extends TakeScreen implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FAILED To EXECUTE");
		failed(result.getMethod().getMethodName());

	}
}
