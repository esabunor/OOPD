import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
/***************************************************************
*Date: Tues 15th August                                       *
*Author: Tega Esabunor-Nukie 19048895                         *
*Activity: worksheet 8                                        *
***************************************************************/   
public class ShapeCalculator
{
	public static void main(String[] args)
    {       
		System.out.println("enter a number from the following options");
		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		System.out.println("3. Triangle");
		System.out.println("4. Exit");
		Scanner scn = new Scanner(System.in);
		int selection = scn.nextInt();
		switch(selection)
		{
			case 1:
				circleCalc();
				break;
			case 2:
				rectangleCalc();
				break;
			case 3:
				triangleCalc();
				break;
			case 4:
				calculateFromFile();
				break;
			case 5:
				exit();
				break;
			default:
				System.out.println("invalid selection");
		}
		
	}

    

	/***************************************************************
    *Purpose: To call integerinput and call circle submodule       *
    *Date: Tues 15th August                                        *
    *Import: none                                                  *
    *Export: none                                                  *
    *Assertion:                                                    *
    ***************************************************************/	
    public static void circleCalc()
	{
		int diameter = integerInput("Enter the value fo the diameter of the circle in cm");;//get integer from standard input
		circle(diameter);
		System.out.println("The area of the circle is " + truncate(circle(diameter)));
	}

	/***************************************************************
    *Purpose: To call integerinput and call reetangle submodul     *
    *Date: Tues 15th August                                        *
    *Import: none                                                  *
    *Export: none                                                  *
    *Assertion:                                                    *
    ***************************************************************/
	public static void rectangleCalc()
	{
		double length = realInput("Enter the value of the length of the rectangle in cm");//get real number from standard input
		double width = realInput("Enter the value of the width of the recatangle in cm");;//get real number from standard input
		rectangle(length, width);
		System.out.println("The area of teh rectangle is "+ truncate(rectangle(length, width)));
	}
   
	/***************************************************************
    *Purpose: To call integerinput and call reetangle submodul     *
    *Date: Tues 15th August                                        *
    *Import: none                                                  *
    *Export: none                                                  *
    *Assertion:                                                    *
    ***************************************************************/
        
    public static void triangleCalc()
	{
		double base = realInput("Enter the value of the base of the triangle");;//get real number from standard input
		double height = realInput("Enter the value of the height of the triangle");;//get real number from standard input
		triangle(base, height);
		System.out.println("The area of the triangle is " + truncate(triangle(base, height)));
	}

    /***************************************************************
    *Purpose: To input a integer number from standard input        *
    *Date: Tues 15th August                                        *
    *Import: message to be outputted to console to prompt user     *
    *Export: number an integer                                     *
    *Assertion: The number exported will always be an integer      *
    ***************************************************************/	
	public static int integerInput(String message)
	{
		Scanner sc = new Scanner(System.in);//instantiation of scanner for standard input
		System.out.println(message);
		int number = sc.nextInt();
		return number;		
	}
	
    /***************************************************************
    *Purpose: To input a real number from standard input           *
    *Date: Tues 15th August                                        *
    *Import: message to be outputted to console to prompt user     *
    *Export: number a real number                                  *
    *Assertion: The number exported will always be real            *
    ***************************************************************/	
	
	public static double realInput(String message)
	{
		Scanner sc = new Scanner(System.in);;//instantiation of scanner for standard input
		System.out.println(message);
		double number = sc.nextDouble();//reading a double from standard input
		return number;		
	}

    /***************************************************************
    *Purpose: To Calculate the area of a circle                    *
    *Date: Tues 15th August                                        *
    *Import: Diameter of circle in cm                              *
    *Export: Area of circle in cm^2                                *
    *Assertion: The area of the circle is pi*diamet er2^2          *
    ***************************************************************/	
	public static  double  circle(int diameter)
	{
		double area = Math.PI * (Math.pow((double)diameter/2.0,2));//area of circle is pi*r^2
		return area;
	}

	/***************************************************************
    *Purpose: To Calculate the area of a rectangle                 *
    *Date: Tues 15th August                                        *
    *Import: The lenght and width of a rectanle in cm              *
    *Export: Area of a rectangle in cmc^2                          *
    *Assertion: The area is the lenght times width                 *
    ***************************************************************/
	public static  double rectangle(double length, double width)
	{
		double area = length * width;//area of rectangle is lenght * width
		return area;
	}

	/***************************************************************
    *Purpose: To Calculate the area of a triangle                  *
    *Date: Tues 15th August                                        *
    *Import: Base and height of triangle in mm                     *
    *Export: Area of triangle in cm^2                              *
    *Assertion: The area is half base times height                 *
    ***************************************************************/
	public static  double triangle(double base, double height)
	{
		double area = (0.5 * base * height)/100.0;//area of triangle = 0.5*(base*height)
		return area;
	}

    /***************************************************************
    *Purpose: To truncate the an area into m^2 cm^2 and mm^2       *
    *Date: Tues 15th August                                        *
    *Import: number to be truncated in cm^2                        *
    *Export: A string of the truncated area                        *
    *Assertion: The output is going to be string                   *
    ***************************************************************/
	public static String truncate(double number)
	{
		int m = (int)number / 10000;//truncates number then integer divide
		int cm = (int)number % 10000;//finds the cm^2 remainders
		double mm = (number - (m * 10000) - cm) * 100;
		String output = m + "m, " + cm + "cm, " + mm+ " mm";
		return output;
	}
    
    /**************exit when      *
     *Date: Tues 15th August                                        *
     *Import: number to be truncated in cm^2                        *
     *Export: A string of the truncated area                        *
     *Assertion: The output is going to be string                   *
     ***************************************************************/
	public static void  exit()
	{
		System.out.println("Goodbye");
	}
	
	/***************************************************************
    *Purpose: Called to calculate from a fi                        *
    *Date: Tues 15th Septem                                        *
    *Import: none                        
    ****************************************************************/
	public static void calculateFromFile() 
	{
		System.out.println("Please provide a filename");		
		Scanner scn = new Scanner(System.in);
		String filename = scn.next();
		int[] noOfShapes = getNumberOfShapes(filename);
		if (noOfShapes != null)
		{
			Double[] rectarr = new Double[noOfShapes[0]];
			Double[] triarr = new Double[noOfShapes[1]];
			Double[] cirarr = new Double[noOfShapes[2]];
			calculate(rectarr, triarr, cirarr, filename);
			writefile("outputfile.txt", rectarr, triarr, cirarr);
		}
	}


	/***************************************************************
    *Purpose: writes to a file -> outputfile.txt                   *
    *Date: Tues 15th Septem                                        *
    *Import: none                        
    ****************************************************************/
	public static void writefile(String filename, Double[] rectarr, Double[] triarr, Double[] cirarr) {
		FileOutputStream fileOut = null;
		try {
			fileOut = new FileOutputStream(filename);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		PrintWriter pw = new PrintWriter(fileOut);
		for(int i = 0; i < rectarr.length; i++)
		{
			pw.write(rectarr[i].toString());
			pw.write("\n");
		}
		for(int i = 0;i <  triarr.length; i++)
		{
			pw.write(triarr[i].toString());
			pw.write("\n");
		}
		for(int i = 0;i <  cirarr.length; i++)
		{
			pw.write(cirarr[i].toString());
			pw.write("\n");
		}
		
	}


	/***************************************************************
    *Purpose: Called to calculate shape area                      *
    *Date: Tues 15th Septem                                        *
    *Import: none                        
    ****************************************************************/
	public static void calculate(Double[] rectarr, Double[] triarr, Double[] cirarr, String filename) {
		int numRect = 0, numTri = 0, numCircle = 0;
		char shapeType = ' ', currentShape = ' ';
		BufferedReader bufRdr = doFileOpening(filename);
		String line = "";
		boolean error = false;
		int lineNo = 0;
		try {
			line = bufRdr.readLine();
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		}
		while(line != null)
		{	
			
			lineNo++;
			StringTokenizer tokeniser = new StringTokenizer(line, ",");
			for(int i = 0; tokeniser.hasMoreTokens(); i++)
			{
				if(i == 0)
				{
					shapeType = tokeniser.nextToken().charAt(0);
					switch(shapeType)
					{
					case 'R':
						currentShape = 'r';
						numRect++;
						break;
					case 'C':
						currentShape = 'c';
						numCircle++;
						break;
					case 'T':
						currentShape = 't';
						numTri++;
						break;
					default:
						numRect = -1; numTri = -1; numCircle = -1;
						System.out.println("Error infile format in line" + lineNo);
					}
				} 
				else 
				{
					switch(currentShape)
					{
					case 'r':
						double base = Double.valueOf(tokeniser.nextToken());
						double height = Double.valueOf(tokeniser.nextToken());
						rectarr[numRect - 1] = rectangle(base, height);
						break;
					case 'c':
						int diam = Integer.valueOf(tokeniser.nextToken());
						cirarr[numCircle - 1] = circle(diam);
						break;
					case 't':
						double basetri = Double.valueOf(tokeniser.nextToken());
						double heighttri = Double.valueOf(tokeniser.nextToken());
						triarr[numTri - 1] = triangle(basetri, heighttri);
						break;
					default:
						numRect = -1; numTri = -1; numCircle = -1;
						System.out.println("Error infile format in line" + lineNo);
					}
					
				}
				
			}
			
			try {
				line = bufRdr.readLine();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}


	/***************************************************************
    *Purpose: Called to get number of shapes in file               *
    *Date: Tues 15th Septem                                        *
    *Import: filename                        
    ****************************************************************/
	public static int[] getNumberOfShapes(String filename) {
		int numRect = 0, numTri = 0, numCircle = 0, lineNo = 0;
		BufferedReader bufRdr = doFileOpening(filename);
		String line = "";
		char shapeType = ' ';
		boolean error = false;
		try {
			line = bufRdr.readLine();
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		}
		while(line != null)
		{	
			lineNo++;
			StringTokenizer tokeniser = new StringTokenizer(line, ",");
			for(int i = 0; tokeniser.hasMoreTokens(); i++)
			{
				if(i == 0)
				{
					shapeType = tokeniser.nextToken().charAt(0);
					switch(shapeType)
					{
					case 'R':
						numRect++;
						break;
					case 'C':
						numCircle++;
						break;
					case 'T':
						numTri++;
						break;
					default:
						System.out.println("Error infile format in line" + lineNo);
					}
				}
			}
			
			try {
				line = bufRdr.readLine();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		try {
			bufRdr.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		int[] arrOfNoOfShp = null;
		if(!error)
			arrOfNoOfShp = new int[]{numRect, numTri, numCircle};
		return arrOfNoOfShp;
	}
	
	/***************************************************************
    *Purpose: opens a file for writing                             *
    *Date: Tues 15th Septem                                        *
    *Import: none                        
    ****************************************************************/
	public static BufferedReader doFileOpening(String filename)
	{
		
		FileInputStream fileIns = null;
		BufferedReader bufRdr = null;
		InputStreamReader rdr = null;
		try {
			fileIns = new FileInputStream(filename);
			rdr = new InputStreamReader(fileIns);
			bufRdr = new BufferedReader(rdr);
			
		} catch (IOException e) {
			System.out.println("Error while reading file" + e.getMessage());
		}
		return bufRdr;
	}
}
