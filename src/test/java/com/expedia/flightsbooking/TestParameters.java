package com.expedia.flightsbooking;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {

	@BeforeClass
	@Parameters({"browser", "platform"})
	public void setUp(String browser, String platform) {
		System.out.println("TestNG_Parameters -> Setup");
		System.out.println("1. Parameter value from xml file: " + browser);
		System.out.println("2. Parameter value from xml file: " + platform);
	}
	
	@Test
	@Parameters({"response"})
	public void testMethod1(String response) throws InterruptedException {
		String[] stringArray = response.split(",");
		System.out.println("TestNG_Parameters -> testMethod1");
		System.out.println("Response from xml file: " + response);
		int i = 0;
		for(String element: stringArray) {
			System.out.println("stringArray[" + i + "] from xml file: " + element);
			i++;
		}
	}
}
