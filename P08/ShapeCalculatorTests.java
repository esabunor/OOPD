import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)

public class ShapeCalculatorTests
{	
	@Test
	public void testTriangleCalculation()
	{
		double base = 9203.3 , height = 18.23;
		double expectedArea = 109.3;
		double actualArea = ShapeCalculator.triangle(base, height);
		assertEquals("Error in calculation of area", expectedArea, actualArea, 0.01);	
	}
	
	@Test
	public void testCircleCalculation()
	{
		int diameter = 290;
		double expectedArea = 3920.3;
		double actualArea = ShapeCalculator.circle(diameter);
		assertEquals("Error in calculation of circle", expectedArea, actualArea, 0.01);
	}

	@Test
	public void testRectangleCalculation()
	{
		double length = 2030.342, width = 323.09;
		double expectedArea = 9203.5;
		double actualArea = ShapeCalculator.rectangle(length, width);
		assertEquals("Error in calculation of rectangle", expectedArea, actualArea, 0.01);
	}
	
	@Test
    public void testRectangleCalculationTwo()
	{
 	}	
}
