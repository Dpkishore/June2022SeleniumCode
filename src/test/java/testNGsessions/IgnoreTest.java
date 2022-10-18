package testNGsessions;

import org.testng.annotations.Test;

public class IgnoreTest {
	
	@Test(description="searching productTest",priority=1)
	public void searchTest(){
		System.out.println("SearchTest");
	}
	@Test(priority = 2)
	public void logoTest() {
		System.out.println("logo test");

	}
	
	@Test(enabled = true, description = "making payment via cc and debit card", priority = 3)
	public void paymentTest() {
		System.out.println("paymentTest");

	}
}
