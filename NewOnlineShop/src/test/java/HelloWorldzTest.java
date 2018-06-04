package test.java;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelloWorldzTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void  TestMethod1(){
		System.out.println("testMethod1()");
		System.out.println("");
	}
	@Test
	public void  TestMethod4(){
		System.out.println("testMethod4()");
		System.out.println("Test Fail");
	}
	@Test
	public void  TestMethod2(){
		System.out.println("testMethod2()");
	}
	
	@Test
	public void  TestMethod3(){
		System.out.println("testMethod3()");
	}
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
