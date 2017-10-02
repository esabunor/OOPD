import java.util.*;
import java.io.*;

public class Question4
{
	public static void main(String[] args)
	{
		outputArray(calculateE(storeInArray(getN())));
	}

	public static long factorial(int number)
	{
		long factorial = 1;
		for( int i = 1; i <= number; i++)
		{
			factorial *= i;
		}
		return factorial;
	}
	
	public static double inverse(long number)
	{
		return  1/(double)number;	

	}
	
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
	
	public static void outputArray(double[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}

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
