package Test;

import Application.JUnitApplication;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.*;

/**
 * 
 * @author Talha Yaseen
 *
 * Test class - 1
 */
public class JUnitApplicationTest1 {
	JUnitApplication obj = new JUnitApplication();
	int[] arr = new int[6];
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Run @BeforeClass1");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Run @AfterClass1");
	}
	
	@Before
	public void setUp() {
		System.out.println("Run @Before1");
		arr[0] = 90;
		arr[1] = 8;
		arr[2] = 34;
		arr[3] = 22;
		arr[4] = 63;
		arr[5] = 32;
	}
	
	@After
	public void tearDown() {
		System.out.println("Run @After1");
	}
	
	@Test
	public void testPositive1() {
		assertEquals(obj.minArray(arr), 8);	// positive test case
	}
	
	@Test
	public void testNegative1() {
		assertEquals(obj.maxArray(arr), "abc");	// maxArray() can't return a string (negative test case)
	}
	
	@Test
	public void testFailed1() {
		assertNull(obj.findElement(63, arr));	 	// failed test case... correct answer is "Y"
	}
	
	@Test
	public void testPositive2() {
		assertTrue(obj.sumArray(arr) == 249);	// positive test case
	}
	
	@Test(timeout = 100) 
	public void testFailed2() {
		while(true) {}				// failed test case
	}
}
