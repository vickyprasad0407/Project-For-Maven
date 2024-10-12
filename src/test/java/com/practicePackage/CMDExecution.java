package com.practicePackage;

import org.testng.annotations.Test;

public class CMDExecution {
	
	@Test
	public void test()
	{
		String BROWSER = System.getProperty("browser");
		String URL=System.getProperty("url");

		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(System.getenv("USERDOMAIN"));
	}
}
