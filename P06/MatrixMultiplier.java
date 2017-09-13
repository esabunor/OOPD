import java.util.*;
import java.io.*;

public class MatrixMultiplier
{
	public static void main(String[] args)
	{
	}

	public int[][] multiplyArrays(int[][] matrixA, int[][] matrixB)
	{
	}


	public void printArray(int[][] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				if(i == array.length - 1)
				{
					System.out.println("");
				}
				
				System.out.println(array[i][j]);
			}
		}
	}

	public int[][] readArray(string filename)
	{
		int[][] matrix = ArrayReader.readArray(ArrayReader.getFileName());
		
		if (matrix == null)
		{
			System.out.println("Invalid input files");
			System.exit(1);
		}
		else
		{
			return matrix;
		}
	}
}
