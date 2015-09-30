import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;


public class TriangleTest {

	@Test
	public void test() {
		Triangle t = new Triangle(3,4,5);
		double p = t.getPerimeter();
		assertTrue(p==12.0);
		
		double a = t.getArea();
		assertTrue(a==6.0);
		
		double side1 = t.getSide1();
		assertTrue(side1 == 3.0);
		
		double side2 = t.getSide2();
		assertTrue(side2 == 4.0);
		
		double side3 = t.getSide3();
		assertTrue(side3 == 5.0);
		
		
		
	}

}
