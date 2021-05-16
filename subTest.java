import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class subTest {
	private static Calculator Cal1 = null;

	@BeforeClass
	public static void setup() {
		Cal1 = new Calculator();
	}

	@Test
	public void Test1() {
		double actual = Cal1.substract(5, 2);
		double expected = 3;
		assertEquals(expected, actual, 0);
	}

	@Test
	public void Test2() {
		double actual = Cal1.substract(3, 3);
		double expected = 0;
		assertEquals(expected, actual, 0);
	}

}
