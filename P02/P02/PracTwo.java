import java.util.*;
       /***************************************************************
        *Date: Tues 15th August                                       *
        *Author: Tega Esabunor-Nukie 19048895                         *
        *Activity: worksheet 2                                        *
        ***************************************************************/   
public class PracTwo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of the diameter of the circle in cm ");
		int diameter = sc.nextInt();
		System.out.println("Enter the value of the length and width of the rectangle in cm");
		double length = sc.nextDouble();
		double width = sc.nextDouble();
		System.out.println("Enter the values of the base and height of the triangle in mm");
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		System.out.println("The area of the circle is " + truncate(circle(diameter)));
		System.out.println("The area of teh rectangle is "+ truncate(rectangle(length, width)));
		System.out.println("The area of the triangle is " + truncate(triangle(base, height)));
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
		double area = Math.PI * (Math.pow((double)diameter/2.0,2));
		return area;
	}
	/***************************************************************
        *Purpose: To Calculate the area of a circle                    *
        *Date: Tues 15th August                                        *
        *Import: The lenght and width of a rectanle in cm              *
        *Export: Area of a rectangle in cmc^2                          *
        *Assertion: The area is the lenght times width                 *
        ***************************************************************/
	public static  double rectangle(double length, double width)
	{
		double area = length * width;
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
		double area = (0.5 * base * height)/100.0;
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
		int m = (int)number / 10000;
		int cm = (int)number % 10000;
		double mm = (number - (m * 10000) - cm) * 100;
		String output = m + "m, " + cm + "cm, " + mm+ " mm";
		return output;
	}
}
