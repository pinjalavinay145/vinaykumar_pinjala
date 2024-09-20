package com.comcast.crm.Organizations_Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Interview {
	
	
	@Test(groups = "smoke")
	public void m1() {
		
		assertEquals("bharath", "bharath");
		System.out.println("m1 passed");
		
	}
     
	
	@Test(groups = "smoke")
	public void m2() {
		System.out.println("beforem2");
		assertEquals("bharat", "bharath");
		System.out.println("m2 passed");
		
	}
	
	
	
	@Test(groups = "smoke")
	public void m3() {
		
		assertEquals("bharath", "bharath");
		System.out.println("m passed");
		
	}
}
