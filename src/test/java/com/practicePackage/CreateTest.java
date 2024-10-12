package com.practicePackage;

import org.testng.annotations.Test;

public class CreateTest {
	
	@Test(groups = "smoke")
	public  void create()
	{
		System.out.println("created test project");
		System.out.println("project testing");
	}
	@Test(groups = "regression")
	 public void login()
	 {
		System.out.println("login");
	 }

}
