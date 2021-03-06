import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

/***************************************************************
 *Date: Tues 15th Septem                                       *
 *Author: Tega Esabunor-Nukie 19048895                         *
 *Activity: worksheet 6                                        *
 ***************************************************************/
@RunWith(JUnit4.class)
public class FactorialTest
{
    /***************************************************************
     *Purpose: To test factorial method                             *
     *Date: Tues 15th Septem                                        *
     *Import: none                                                  *
     *Export: none                                                  *
     *Assertion:                                                    *
     ***************************************************************/
	@Test
	public void testFactorial()
	{
		long expectedFactorial = 120;
		long actualFactorial = Factorial.factorial(5);
		assertEquals("Actual factorial is not equal to expected factorial", expectedFactorial, actualFactorial);
	}

}
