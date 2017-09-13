import java.util.*;
/***************************************************************
*Date: Tues 15th August                                       *
*Author: Tega Esabunor-Nukie 19048895                         *
*Activity: worksheet 2                                        *
***************************************************************/   
public class ShapeCalculator
{
	public static void main(String[] args)
    {       
		circleCalc();
		rectangleCalc();
		triangleCalc();
			
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
		System.out.println("Enter the values of the base and height of the triangle in mm");
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
		System.out.println("Enter the values of the base and height of the triangle in mm");
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
}
