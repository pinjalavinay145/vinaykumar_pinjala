package com.comcast.crm.Organizations_Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Interviewx {
	@Test(groups = "smoke")
	public void B1() {
		System.out.println("beforeB1");
		assertEquals("bharath", "bharat");
		System.out.println("B1 passed");
		
	}
	@Test(groups = "smoke")
	public void B2() {
		System.out.println("beforeB2");
		assertEquals("bharath", "bharathb");
		System.out.println("m2 passed");
		
	}
	
	@Test(groups = "smoke")
	public void B3() {
		
		assertEquals("bharath", "bharath");
		System.out.println("B3 passed");
		
	}
}
