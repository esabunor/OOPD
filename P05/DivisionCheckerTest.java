import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

/***************************************************************
*Date: Tues 15th Septem                                       *
*Author: Tega Esabunor-Nukie 19048895                         *
*Activity: worksheet 5                                        *
***************************************************************/  
@RunWith(JUnit4.class)
public class DivisionCheckerTest 
{	
	/***************************************************************
    *Purpose: To test the DivisionChecker.divisionChecker submodule*
    *Date: Tues 15th Septem                                        *
    *Import: none                                                  *
    *Export: none                                                  *
    *Assertion:                                                    *
    ***************************************************************/
	@Test
	public void testDivisionChecker()
	{
		int numOne = 5, numTwo = 9;
		boolean expectedCheck = false;
		boolean actualCheck = DivisionChecker.divisionChecker(numOne, numTwo);
		assertTrue("expected check is not equal to actualCheck", expectedCheck == actualCheck);
		
	}
	
	/***************************************************************
    *Purpose: To test the DivisionChecker.checkNumbers    submodule*
    *Date: Tues 15th Septem                                        *
    *Import: none                                                  *
    *Export: none                                                  *
    *Assertion:                                                    *
    ***************************************************************/
	@Test
	public void testCheckNumber()
	{
		int numOne = 0, numTwo = 5;
		boolean expectedError = false;
		boolean actualError = DivisionChecker.checkNumbers(numOne, numTwo);
		assertTrue("expected error is not equal to actual error", expectedError == actualError);
	}

	/***************************************************************
    *Purpose: To test the DivisionChecker.divisionChecker submodule*
    *Date: Tues 15th Septem                                        *
    *Import: none                                                  *
    *Export: none                                                  *
    *Assertion:                                                    *
    ***************************************************************/
	@Test
	public void testDivsionCheckerTwo()
	{
		int numOne = 4, numTwo = 0;
		boolean expectedCheck = false;
		boolean actualCheck = DivisionChecker.divisionChecker(numOne, numTwo);
		assertTrue("expectedCheck is not equal to the actualCheck", expectedCheck == actualCheck);
	}
}
