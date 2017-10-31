import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class CircleClassTest 
{
	@Test
	public void testTriangleCalculation()
	{
		double base = 9203.3 , height = 18.23;
		double expectedArea = 109.3;
		double actualArea = ShapeCalculator.triangle(base, height);
		assertEquals("Error in calculation of area", expectedArea, actualArea, 0.01);	
	}
}
