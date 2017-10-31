import java.util.*;

/***************************************************************
*Date: Tues 15th August                                       *
*Author: Tega Esabunor-Nukie 19048895                         *
*Activity: worksheet 8                                        *
***************************************************************/  
public class Circle extends Shape
{
	private int diameter;
	private double area;
	
	/***************************************************************
    *Purpose: Default constructor               
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public Circle()
	{
		super();
		diameter = 0;
		area = 0.0;
	}
	
	/***************************************************************
    *Purpose: alternate constructor               
    *Date: Tues 15th Septem                                       
    *Import: diameter, area                        
    ****************************************************************/
	public Circle(int diameter, double area) 
	{
		super();
		this.diameter = diameter;
		setArea(calcArea());
	}

	/***************************************************************
    *Purpose: copy constructor               
    *Date: Tues 15th Septem                                       
    *Import: Circle obj                        
    ****************************************************************/
	public Circle(Circle inCircle)
	{
		super(inCircle);
		diameter = inCircle.getDiameter();
		area = inCircle.getArea();
	}
	
	/***************************************************************
    *Purpose: Diameter accessor
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public int getDiameter() 
	{
		return diameter;
	}
	
	/***************************************************************
    *Purpose: Diameter accessor
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public void setDiameter(int diameter) 
	{
		this.diameter = validateDiameter(diameter);
	}
	
	/***************************************************************
    *Purpose: validate Diameter 
    *Date: Tues 15th Septem                                       
    *Import: diameter                        
    ****************************************************************/
	private int validateDiameter(int diameter) 
	{
		if(diameter < 0) 
			throw new IllegalArgumentException("diameter can't be less than 0");
		return diameter;
	}
	
	/***************************************************************
    *Purpose: clone this object
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public Circle clone()
	{
		return new Circle(this);
	}
	
	/***************************************************************
    *Purpose: implementation of super class method
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public double calcArea() 
	{
		return Math.PI * (Math.pow((double)diameter/2.0,2));
	}

	public String toString() 
	{
		return "Circle [diameter=" + diameter + ", area=" + area + "]";
	}
	
	public boolean equals(Object obj) {
		boolean equals = false;
		Circle other = (Circle) obj;
		if(other.getArea() == this.getArea())
			if(other.getFillColour().equalsIgnoreCase(this.getFillColour()))
				if(other.getLineColour().equalsIgnoreCase(this.getLineColour()))
					if(other.getArea() == this.getArea())
						if(other.getDiameter() == this.diameter)
							equals = true;
		return equals;
	}
	
	
}

