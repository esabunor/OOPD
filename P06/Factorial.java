import java.util.*;
import java.io.*;

public class Factorial
{
	public static void main(String[] args)
	{
		outputFactorial(factorial(inputFactorial()));
	}
	
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

	public static int inputInteger()
	{
		System.out.println("Provide an integer to calculate its factorial");
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		return number;
	}
	
	public static void validateInput()
	{
	}
		
}
