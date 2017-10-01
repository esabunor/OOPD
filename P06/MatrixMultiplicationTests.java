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
public class MatrixMultiplicationTests
{
    /***************************************************************
     *Purpose: To test the matrix multiplication method             *
     *Date: Tues 15th Septem                                        *
     *Import: none                                                  *
     *Export: none                                                  *
     *Assertion:                                                    *
     ***************************************************************/
	@Test
	public void testMatrixMultiplication()
	{
		int[][] a = new int[][]{{1,2,3}, {3,2,1}};
		int[][] b = new int[][]{{1,3},{2,3},{3,5}};	
		int[][] expectedMatrix = new int[][]{{14,24},{10,20}};
		int[][] actualMatrix = MatrixMultiplier.multiplyArrays(a, b);
		for(int i = 0; i < actualMatrix.length - 1; i++)
		{
			for(int j = 0; j < actualMatrix[0].length - 1; j++)
			{
				assertEquals("Actual matrix  is not equal to expected matrix", expectedMatrix[i][j], actualMatrix[i][j]);
			}
		}
	}

}
