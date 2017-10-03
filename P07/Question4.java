import java.util.*;
import java.io.*;

/***************************************************************
 *Date: Tues 15th Septem                                       *
 *Author: Tega Esabunor-Nukie 19048895                         *
 *Activity: worksheet 7                                        *
 ***************************************************************/
public class Question4
{
	public static void main(String[] args)
	{
		outputArray(calculateE(storeInArray(getN())));
	}

    /***************************************************************
     *Purpose: To find the factorial of a number                    *
     *Date: Tues 15th Septem                                        *
     *Import: number                                                *
     *Export: factorial                                             *
     *Assertion:                                                    *
     ***************************************************************/

	public static long factorial(int number)
	{
		long factorial = 1;
		for( int i = 1; i <= number; i++)
		{
			factorial *= i;
		}
		return factorial;
	}
	
    /***************************************************************
     *Purpose: To find the inverse of a number                      *
     *Date: Tues 15th Septem                                        *
     *Import: number                                                *
     *Export: inverse                                               *
     *Assertion:                                                    *
     ***************************************************************/
	public static double inverse(long number)
	{
		return  1/(double)number;// converto to double to avoid mix mode arithemetic	

	}
	
    /***************************************************************
     *Purpose: To calculate the terms in E                          *
     *Date: Tues 15th Septem                                        *
     *Import: array of E terms                                      *
     *Export: array of E terms                                      *
     *Assertion:                                                    *
     ***************************************************************/
	public static double[] calculateE(double[] array)
	{
		double sum = 0.0;
		for(int i = 0; i < array.length - 1; i++)
		{
			sum +=	array[i]; 

		}
		array[array.length - 1] = sum;
		return array;
	}

    /***************************************************************
     *Purpose: To compute the                                       *
     *Date: Tues 15th Septem                                        *
     *Import: number                                                *
     *Export: array of e terms                                      *
     *Assertion:                                                    *
     ***************************************************************/
	public static double[] storeInArray(int number)
	{
		double[] array = new double[number + 1];
		array[0] = 1;
		for(int i = 1; i < number;i++)
		{
			array[i] = inverse(factorial(i));
		}
		return array;
	}
	
    /***************************************************************
     *Purpose: To print out the array of E terms                    *
     *Date: Tues 15th Septem                                        *
     *Import: array                                                 *
     *Export: none                                                  *
     *Assertion:                                                    *
     ***************************************************************/
	public static void outputArray(double[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}

    /***************************************************************
     *Purpose: To get the number of in the series                   *
     *Date: Tues 15th Septem                                        *
     *Import: none                                                  *
     *Export: int number of terms                                   *
     *Assertion:                                                    *
     ***************************************************************/
	public static int getN()
	{
		System.out.println("please provide a value for n between 6 and 100 inclusive");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while(n < 6 || n > 100)
		{
			System.out.println("please provide a value for n between 6 and 100 inclusive");
			n = scn.nextInt();
		}
		return n;
	}

}	
