import java.util.*;
import java.io.*;

/***************************************************************
*Date: Tues 15th August                                       *
*Author: Tega Esabunor-Nukie 19048895                         *
*Activity: worksheet 3                                        *
***************************************************************/   
public class QuestionFive
{	
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		double weight = stdin.nextDouble();
		int stones = getStones(weight);
		int pounds = getPounds(weight, stones);
		double ounces = getOunces(weight, stones, pounds);
		System.out.println("weight is " + stones + " " + pounds + " "+ ounces);

	}
    /***************************************************************
    *Purpose: To calculate the number of stones                    *
    *Date: Tues 15th August                                        *
    *Import: weight in double                                      *
    *Export: stones in int                                         *
    *Assertion:                                                    *
    ***************************************************************/	
    
	public static int getStones(double weight)
	{
		int stones = (int) weight; // stones is the truncated value of weight in doubles
		return stones;
	}
    
	/***************************************************************
    *Purpose: To calculate in the number of Pounds                 *
    *Date: Tues 15th August                                        *
    *Import: weight in double and stones in int                    *
    *Export: pounds in in                                          *
    *Assertion:                                                    *
    ***************************************************************/	
    
	public static int getPounds(double weight, int stones)
	{
		int pounds = (int) ((weight - (double)stones)); // pounds is the integer remainder of taking away stones from weight
		return pounds;
	}

	/***************************************************************
    *Purpose: To calculate the number of ounces                    *
    *Date: Tues 15th August                                        *
    *Import: weight in real integer , stones and pounds            *
    *Export: ounces in double                                      *
    *Assertion:                                                    *
    ***************************************************************/	

    public static double getOunces(double weight, int stones, int pounds)
	{
		double ounces =((((weight - (double)stones) *14.0) - (double) pounds) * 16.0) ; // (weight * stones) * 14.0, has pounds taking from it and multiplied by 16.0
		return ounces;
	}
}	
