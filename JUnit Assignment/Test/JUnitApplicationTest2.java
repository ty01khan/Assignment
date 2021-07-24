package Test;

import Application.JUnitApplication;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class JUnitApplicationTest2 {
	JUnitApplication obj = new JUnitApplication();
	
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
	}
	
	@After
	public void tearDown() {
		System.out.println("Run @After2");
	}
	
	@Test
	public void testPositive1() {
		assertEquals(obj.maxArray(), 9);	// positive test case
	}
	
	@Test
	public void testNegative1() {
		assertEquals(obj.minArray(), false);	// minArray() can't return a boolean (negative test case)
	}
	
	@Test
	public void testPositive2() {
		assertNotNull(obj.findElement(1));	 	// positive test case
	}
	
	@Test
	public void testFailed1() {
		assertTrue(obj.sumArray() == 55);	// failed test case... correct answer is 45
	}
	
	@Ignore
	@Test
	public void ignoreTest1() {
		assertTrue(obj.findElement(9) == "Y");	// ignore test case
	}
}

