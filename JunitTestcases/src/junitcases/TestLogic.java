package junitcases;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class TestLogic {

/*	public static void setBeforeClass() {
		
		System.out.println("Before class is executed only once before starting all the test"); //it is not going to test only instruction is given to user
	}
	
	
	@Before
	public void setUp()
	{
		System.out.println("@Before method is executed for each and every test ");
	}  */
	
	@Test
	public void testmethod()
	{
		System.out.println("This was under test here");
		assertEquals(7,TestL.greatestOfThree(4, 5, 7));   //if we have 2method we just call by giving assertequals no need to write test again
		
	}
	
/*	@After
	public void tearDown() throws Exception{
		System.out.println("It executes after each and every test is completed");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		System.out.println("@AfterClass is going to be executed after completion of all the test");
	}
	*/
	
	
}
