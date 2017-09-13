import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class FactorialTest
{
	@Test
	public void testFactorial()
	{
		long expectedFactorial = 120;
		long actualFactorial = Factorial.factorial(5);
		assertEquals("Actual factorial is not equal to expected factorial", expectedFactorial, actualFactorial);
	}

}
