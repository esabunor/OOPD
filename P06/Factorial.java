import java.util.*;
import java.io.*;

/***************************************************************
 *Date: Tues 15th Septem                                       *
 *Author: Tega Esabunor-Nukie 19048895                         *
 *Activity: worksheet 6                                        *
 ***************************************************************/
public class Factorial
{
	public static void main(String[] args)
	{
		outputFactorial(factorial(inputInteger()));
	}
	
    /***************************************************************
     *Purpose: To calculate the factoria                            *
     *Date: Tues 15th Septem                                        *
     *Import: number                                                *
     *Export: factorial                                             *
     *Assertion:                                                    *
     ***************************************************************/
	public static long factorial(int number)
	{
		long factorial =  1;
		for(int i = number; i >= 1; i--)
		{
			factorial *= number;
		}
		
		return factorial;
	}

	public static void outputFactorial(long factorial)
	{
		System.out.println("factorial is " + factorial);
	}
    
    /***************************************************************
     *Purpose: To obtain integer from                               *
     *Date: Tues 15th Septem                                        *
     *Import: none                                                  *
     *Export: number                                                *
     *Assertion:                                                    *
     ***************************************************************/
	public static int inputInteger()
	{
		System.out.println("Provide an integer to calculate its factorial");
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();

		while(number < 1)
		{
			System.out.println("Provide an integer greater than 1");
			number = scn.nextInt();
		}
        scn.close();//close scanner
		return number;
	}
		
}
