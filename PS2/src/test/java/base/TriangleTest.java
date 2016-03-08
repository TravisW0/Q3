package base;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {

	public static Triangle obj;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		obj = new Triangle(5.0,5.0,5.0);
	}

	@Test
	public void test() {
		assertEquals(82.343,obj.getArea(),.1);
		assertEquals(15.0,obj.getPerimeter(),0);
	}
}