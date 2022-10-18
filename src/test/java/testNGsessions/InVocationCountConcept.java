package testNGsessions;

import org.testng.annotations.Test;

public class InVocationCountConcept {
	
	@Test(invocationCount=10)
	public void paymentTest(){
		System.out.println("Payment Test");
	}

}
