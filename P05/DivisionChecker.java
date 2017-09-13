import java.io.*;
import java.util.*;

/***************************************************************
*Date: Tues 15th Septem                                       *
*Author: Tega Esabunor-Nukie 19048895                         *
*Activity: worksheet 5                                        *
***************************************************************/   
public class DivisionChecker
{	
	public static void main(String[] args)
	{
		int numOne = integerInput("enter the first number");
		int numTwo = integerInput("enter the second number");
		boolean error = checkNumbers(numOne, numTwo);// tests for error numbers
		divisibilityOutput(divisionChecker(numOne, numTwo), error);
	}
	
	/***************************************************************
    *Purpose: To call integerinput submodule with a message        *
    *Date: Tues 15th Septem                                        *
    *Import: message(String)                                       *
    *Export: number(int)                                           *
    *Assertion:                                                    *
    ***************************************************************/
	public static int integerInput(String message)
	{
		System.out.println(message);
		Scanner scn = new Scanner(System.in);// initialize scanner
		int number = scn.nextInt();
		scn.close();//close scanner
		return number;
	}
	
	/***************************************************************
    *Purpose: To test the divisibility of numTwo by numOne         *
    *Date: Tues 15th Septem                                        *
    *Import: numOne, numTwo                                        *
    *Export: boolen                                                *
    *Assertion:                                                    *
    ***************************************************************/
	public static boolean divisionChecker(int numOne, int numTwo)
	{
		if (numOne % numTwo == 0)
		{
			return true;// numbers are divisible
		}
		else
		{
			return false;
		}
			
	}
	
	/***************************************************************
    *Purpose: To print the divisibility output of two numbers      *
    *Date: Tues 15th Septem                                        *
    *Import: divisible(boolean)                                    *
    *Export: none                                                  *
    *Assertion:                                                    *
    ***************************************************************/
	public static void divisibilityOutput(boolean divisible, boolean error)
	{
		if (divisible == false && error == false)
		{
			System.out.println("Divible");
		}
		else 
		{
			System.out.println("Not Divisible");
		}
	}
	
	/***************************************************************
    *Purpose: To call integerinput submodule with a message        *
    *Date: Tues 15th Septem                                        *
    *Import: numOne, numTwo                                        *
    *Export: error(boolean)                                        *
    *Assertion:                                                    *
    ***************************************************************/
	public static boolean checkNumbers(int numOne, int numTwo)
	{	
		boolean error;
		if (numOne == 0 || numTwo == 0)
		{
			error = true;//
		}
		else 
		{
			error = false;
		}
		return error;
	}

}
