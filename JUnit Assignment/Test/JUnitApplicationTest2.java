package Test;

import Application.JUnitApplication;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.*;

/**
 * 
 * @author Talha Yaseen
 *
 * Test class - 2
 */
public class JUnitApplicationTest2 {
	JUnitApplication obj = new JUnitApplication();
	int[] arr = new int[9];
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Run @BeforeClass2");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Run @AfterClass2");
	}
	
	@Before
	public void setUp() {
		System.out.println("Run @Before2");
		arr[0] = 5;
		arr[1] = 8;
		arr[2] = 7;
		arr[3] = 2;
		arr[4] = 6;
		arr[5] = 3;
		arr[6] = 9;
		arr[7] = 1;
		arr[8] = 4;
	}
	
	@After
	public void tearDown() {
		System.out.println("Run @After2");
	}
	
	@Test
	public void testPositive1() {
		assertTrue(obj.maxArray(arr) == 9);	// positive test case
	}
	
	@Test
	public void testNegative1() {
		assertEquals(obj.minArray(arr), false);	// minArray() can't return a boolean (negative test case)
	}
	
	@Test
	public void testPositive2() {
		assertNotNull(obj.findElement(1, arr));	 	// positive test case
	}
	
	@Test
	public void testFailed1() {
		assertEquals(obj.sumArray(arr), 55);	// failed test case... correct answer is 45
	}
	
	@Ignore
	@Test
	public void ignoreTest1() {
		assertTrue(obj.findElement(9, arr) == "Y");	// ignore test case
	}
}

