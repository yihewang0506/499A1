import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class divTest {
    private static calculator Cal1 = null;

	@BeforeClass
	public static void setup() {
		Cal1 = new calculator();
	}

	@Test
	public void Test1() {
		double actual = Cal1.divide(5, 2);
		double expected = 2.5;
		assertEquals(expected, actual, 0);
	}

	@Test
	public void Test2() {
		double actual = Cal1.divide(3, 3);
		double expected = 1;
		assertEquals(expected, actual, 0);
	}
    
}
