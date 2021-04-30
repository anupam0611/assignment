package com.springMVCdemo.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.springMVCdemo.HomeService;


public class HomeTest 
{		
	@BeforeClass 
	public static void setUpClass() throws Exception {
		System.out.println("Before Class");  
	}
	
	@Before
	public void setUp() throws Exception {  
        System.out.println("Before");  
    }  
	
	@Test
	public void testHomeService() 
	{	
		System.out.println("Test at Service");  
		HomeService hs = new HomeService();
		assertEquals(4, hs.add(1, 3));
		assertNotEquals(1, hs.div(1, 0));
	}
	
	@Test
	public void testHomeService2() 
	{	
		System.out.println("Test 2 at Service");  
		HomeService hs = new HomeService();
		assertEquals(0, hs.div(1, 0));
	}
	
	@After  
    public void tearDown() throws Exception {  
        System.out.println("After");  
    }
	
	@AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("After Class");  
    }
}