package base;
import static org.junit.Assert.*;

import org.junit.Test;


public class testcase {
	Triangle test = new Triangle(6, 8, 10);

	@Test
	public void test() {

		assertTrue(test.getArea() == 24.0);
		assertTrue(test.getPerimeter() == 24.0);

	}
}
