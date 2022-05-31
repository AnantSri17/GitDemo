package qaclickacademy;

import org.testng.annotations.Test;

public class AppiumTest {
	
	@Test
	public void androidApp() {
		System.out.println("androidApp");
	}
	
	@Test(groups= {"oneGroup"})
	public void iosApp() {
		System.out.println("iosApp");
	}

}
