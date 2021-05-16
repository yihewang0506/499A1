import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class mulTest {
    private static calculator Cal1 = null;

	@BeforeClass
	public static void setup() {
		Cal1 = new calculator();
	}

	@Test
	public void Test1() {
		double actual = Cal1.mutiply(5, 2);
		double expected = 10;
		assertEquals(expected, actual, 0);
	}

	@Test
	public void Test2() {
		double actual = Cal1.mutiply(3, 3);
		double expected = 6;
		assertEquals(expected, actual, 0);
	}
}
