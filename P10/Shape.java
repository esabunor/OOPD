import java.io.*;
import java.util.*;

public abstract class Shape 
{
	private double area;
	private String fillColour;
	private String lineColour;
	
	/***************************************************************
    *Purpose: Default constructor               
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public Shape()
	{
		this.area = 0.0;
		setFillColour("ffffff");
		setLineColour("ffffff");
	}
	
	/***************************************************************
    *Purpose: alternate constructor
    *Date: Tues 15th Septem                                       
    *Import: base, height                        
    ****************************************************************/
	public Shape(String lineColour, String fillColour)
	{
		setFillColour(fillColour);
		setLineColour(lineColour);
		this.area = 0.0;
	}
	
	/***************************************************************
    *Purpose: copy constructor
    *Date: Tues 15th Septem                                       
    *Import: shape instance                        
    ****************************************************************/
	public Shape(Shape other)
	{
		setFillColour(other.getFillColour());
		setLineColour(other.getLineColour());
		this.area = other.getArea();
	}
	
	public String toString() 
	{
		return "Shape [area=" + area + ", fillColour=" + fillColour + ", lineColour=" + lineColour + "]";
	}

	/***************************************************************
    *Purpose: area accessor
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public double getArea() 
	{
		return calcArea();
	}

	/***************************************************************
    *Purpose: fillcolour accessor
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public String getFillColour() 
	{
		return fillColour;
	}

	/***************************************************************
    *Purpose: linecolour accessor
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public String getLineColour() 
	{
		return lineColour;
	}

	/***************************************************************
    *Purpose: area mutator
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public void setArea(double area) 
	{
		this.area = area;
	}

	/***************************************************************
    *Purpose: fillcolour mutator
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public void setFillColour(String fillColour) 
	{
		this.fillColour = validateColour(fillColour);
	}

	/***************************************************************
    *Purpose: linecolour mutator
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public void setLineColour(String lineColour) 
	{
		this.lineColour = validateColour(lineColour);
	}
	
	private String validateColour(String Colour)
	{	
		Integer i = null;
		try
		{
			i = Integer.valueOf(Colour);
			Integer.toHexString(i);
			throw new IllegalArgumentException();
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(Colour + "is  an illegal argument, must be a hexadecimal string");
		}
		return Integer.toHexString(i);
	}
	
	abstract public double calcArea();
	
}
