import java.util.*;
import java.io.*;

/***************************************************************
 *Date: Tues 15th Septem                                       *
 *Author: Tega Esabunor-Nukie 19048895                         *
 *Activity: worksheet 6                                        *
 ***************************************************************/
public class MatrixMultiplier
{
	public static void main(String[] args)
	{
		int[][] a = readArray("matrixA.txt"), b = readArray("matrixB.txt"), c = multiplyArrays(a, b);
		printArray(c);
	}
    
    /***************************************************************
     *Purpose: To multiply two matrices                             *
     *Date: Tues 15th Septem                                        *
     *Import: matrixA matrixB                                       *
     *Export: matrixA* matrixB                                      *
     *Assertion:                                                    *
     ***************************************************************/
	public static int[][] multiplyArrays(int[][] matrixA, int[][] matrixB)
	{
		int[][] c = new int[matrixA.length][matrixB.length];	
		for(int i = 0; i < matrixA.length - 1; i++)//no of rows in matrix A
		{
			for(int j = 0; j < matrixB[0].length - 1; j++)//no of columns in matrix B
			{
				for(int k = 0; k < matrixA[0].length - 1; k++)//no of columns in matrix A
				{
					c[i][j] = c[i][j] + matrixA[i][k] * matrixB[k][j];
				}
			}
		}
		return c;
	}
    
    /***************************************************************
     *Purpose: To print a matrix                                    *
     *Date: Tues 15th Septem                                        *
     *Import: matrix                                                *
     *Export: none                                                  *
     *Assertion:                                                    *
     ***************************************************************/
	public static void printArray(int[][] array)
	{
		for(int i = 0; i < array.length - 1; i++)//array row iter
		{   System.out.println("");//after every row
			for(int j = 0; j < array[i].length - 1; j++)//column iter
			{
				System.out.println(array[i][j]);
                System.out.print("");
			}
		}
	}
    
    /***************************************************************
     *Purpose: To read an array from a file                         *
     *Date: Tues 15th Septem                                        *
     *Import: filename                                              *
     *Export: matrix                                                *
     *Assertion:                                                    *
     ***************************************************************/
	public static int[][] readArray(String filename)
	{
		int[][] matrix = ArrayReader.readArray(ArrayReader.getFileName(filename));
		Scanner scn = new Scanner(System.in);
			
		while(matrix == null)
		{
			System.out.println("Invalid input files");
			System.out.println("Please enter the correct filenames");
	  		filename = scn.nextLine();	
			matrix = ArrayReader.readArray(ArrayReader.getFileName(filename));
		}
		return matrix;
	}
}
