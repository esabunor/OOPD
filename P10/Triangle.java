import java.util.*;

/***************************************************************
*Date: Tues 15th August                                       *
*Author: Tega Esabunor-Nukie 19048895                         *
*Activity: worksheet 8                                        *
***************************************************************/  
public class Triangle extends Shape 
{
	private double base;
	private double height;
	
	/***************************************************************
    *Purpose: alternate constructor
    *Date: Tues 15th Septem                                       
    *Import: base, height                        
    ****************************************************************/
	public Triangle(double base, double height) 
	{	
		super();
		this.base = base;
		this.height = height;
	}
	
	/***************************************************************
    *Purpose: Default constructor               
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public Triangle()
	{	
		super();
		this.base = 0.0;
		this.height = 0.0;
	}
	
	/***************************************************************
    *Purpose: triangle instance
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public Triangle(Triangle inTriangle)
	{
		super(inTriangle);
		base = inTriangle.getBase();
		height = inTriangle.getHeight();
	}
	
	/***************************************************************
    *Purpose: base accessor
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public double getBase() 
	{
		return base;
	}
	
	/***************************************************************
    *Purpose: base mutator
    *Date: Tues 15th Septem                                       
    *Import: base                        
    ****************************************************************/
	public void setBase(double base) 
	{
		this.base = validateWidth(base);
	}
	
	/***************************************************************
    *Purpose: height accessor
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public double getHeight() 
	{
		return height;
	}
	
	/***************************************************************
    *Purpose: height mutator
    *Date: Tues 15th Septem                                       
    *Import: beight                        
    ****************************************************************/
	public void setHeight(double height) 
	{
		this.height = validateHeight(height);
	}
	
	public boolean equals(Object obj) {
		boolean equals = false;
		Triangle other = (Triangle) obj;
		if(other.getArea() == this.getArea())
			if(other.getFillColour().equalsIgnoreCase(this.getFillColour()))
				if(other.getLineColour().equalsIgnoreCase(this.getLineColour()))
					if(other.getArea() == this.getArea())
						if(other.getBase() == this.base)
							if(other.getHeight() == this.height)
								equals = true;
		return equals;
	}
	
	public String toString() 
	{
		return "Triangle [base=" + base + ", height=" + height + ", area=" + getArea() + "]";
	}
	
	/***************************************************************
    *Purpose: implementation of super class abstract method
    *Date: Tues 15th Septem                                       
    *Import: none                        
	    ****************************************************************/
	public double calcArea() 
	{
		return (0.5 * base * height)/100.0;
	}
	
	/***************************************************************
    *Purpose: height validator
    *Date: Tues 15th Septem                                       
    *Import: height                        
    ****************************************************************/
	private double validateHeight(double height)
	{
		if(height < 0) 
			throw new IllegalArgumentException("height can't be less than 0");
		return height;
	}
	
	private double validateWidth(Double width)
	{
		if(width < 0) 
			throw new IllegalArgumentException("width can't be less than 0");
		return width;
	}
	
	public Triangle clone()
	{
		return new Triangle(this);
	}
	
}
