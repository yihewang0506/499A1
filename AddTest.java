
import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddTest {
	private static Calculator Cal1 = null;

	@BeforeClass
	public static void setup() {
		Cal1 = new calculator();
	}

	@Test
	public void Test1() {
		double actual = Cal1.add(3.4, 2.5);
		double expected = 5.9;
		assertEquals("Add function is correct", expected, actual, 0);
	}

	@Test
	public void Test2() {
		double actual = Cal1.add(3.6, 2.4);
		double expected = 6;
		assertEquals("Add function is correct", expected, actual, 0);
	}

}
