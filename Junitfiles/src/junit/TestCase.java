package junit;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCase {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}
	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@Test
	public void testFindGreatestOfThree(){
		System.out.println("test case find max");
		assertEquals(7,Calculation.findGreatestOfThree(5,6,7));
		assertEquals(10,Calculation.findGreatestOfThree(8,9,10));
	}
	
	
	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}

}