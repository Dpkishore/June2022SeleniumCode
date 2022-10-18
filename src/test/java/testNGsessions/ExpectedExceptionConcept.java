package testNGsessions;

import org.apache.commons.compress.archivers.ArchiveException;
import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	
	@Test(expectedExceptions={ArchiveException.class,NullPointerException.class})
	public void searchTest(){
		System.out.println("searchTest");
		int i=9/0;
		System.out.println("bye");
	}

}
