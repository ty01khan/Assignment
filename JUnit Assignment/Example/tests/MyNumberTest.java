package tests;
import static org.junit.Assert.*;
import org.junit.*;
import Application.MyNumber;

public class MyNumberTest {
    private MyNumber number1, number2, number3; // Test fixtures

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Run @BeforeClass"); // for illustration
    }

    @AfterClass
    public static void AfterClass(){
        System.out.println("Run @AfterClass"); // for illustration
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Run @Before"); // for illustration
        number1 = new MyNumber(11);
        number2 = new MyNumber(22);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Run @After"); // for illustration
    }

    @Test
    public void testAdd() {
        System.out.println("Run @Test testAdd"); // for illustration
        assertEquals("error in add()", 33, number1.add(number2).getNumber());
        assertEquals("error in add()", 55, number1.add(number2).getNumber());
    }

    @Test
    public void testDiv() {
        System.out.println("Run @Test testDiv"); // for illustration
        assertEquals("error in div()", 2, number2.div(number1).getNumber());
        assertEquals("error in div()", 0, number2.div(number1).getNumber());
    }

    @Ignore
    @Test
    public void testNullObject(){
        System.out.println("Run @Test testNullObject"); // for illustration
        assertNotNull(number3);
        assertNull(number3);
    }

    @Test
    public void testGreaterthan(){
        System.out.println("Run @Test testGreaterthan"); // for illustration
        //some operations number1
        MyNumber number3 = number1.add(number2);
        System.out.println(number3.getNumber());
        if (number3.getNumber()<100)fail("is less than 100");
    }
}