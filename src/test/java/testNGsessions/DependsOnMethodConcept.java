package testNGsessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	public void createAUser(){
	System.out.println("CreateUser");
	
}
	
	
	@Test
	public void a_createUser(){
		//System.out.println("create user");
		createAUser();
	}
	
	/*@Test(dependsOnMethods="a_createUser")
	public void updateUser() {
		System.out.println("update user");

	}
	
	@Test(dependsOnMethods="a_createUser")
	public void deleteUser() {
		System.out.println("delete user");//101

	}*/
	
	@Test
	public void updateUser() {
		System.out.println("update user");
		createAUser();

	}
	@Test
	public void deleteUser() {
		System.out.println("delete user");
		createAUser();

	}
	
}
