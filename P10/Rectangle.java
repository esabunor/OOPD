import java.util.*;

/***************************************************************
*Date: Tues 15th August                                       *
*Author: Tega Esabunor-Nukie 19048895                         *
*Activity: worksheet 8                                        *
***************************************************************/  
public class Rectangle extends Shape
{
	private double lenght;
	private double width;
	private double area;
	
	/***************************************************************
    *Purpose: Default constructor               
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public Rectangle()
	{	
		super();
		this.lenght = 0.0;
		this.width = 0.0;
	}
	
	/***************************************************************
    *Purpose: alternate constructor               
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public Rectangle(double lenght, double width)
	{
		super();
		this.lenght = lenght;
		this.width = width;
	}
	
	/***************************************************************
    *Purpose: copy constructor               
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public Rectangle(Rectangle inRect)
	{	
		super(inRect);
		lenght = inRect.getLenght();
		width = inRect.getWidth();
		area = inRect.getArea();
		
	}
	
	/***************************************************************
    *Purpose: calculate area               
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public double calcArea() 
	{
		return lenght * width;
	}
	
	/***************************************************************
    *Purpose: lenght accessor
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public double getLenght() 
	{
		return lenght;
	}
	
	/***************************************************************
    *Purpose: width accessor
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public double getWidth() 
	{
		return width;
	}
	
	/***************************************************************
    *Purpose: length mutator
    *Date: Tues 15th Septem                                       
    *Import: length                        
    ****************************************************************/
	public void setLenght(double lenght) 
	{
		this.lenght = validateLenght(lenght);
	}
	
	/***************************************************************
    *Purpose: lenght mutator
    *Date: Tues 15th Septem                                       
    *Import: width                        
    ****************************************************************/
	public void setWidth(double width) 
	{
		this.width = validateWidth(width);
	}

	public String toString() 
	{
		return "Rectangle [lenght=" + lenght + ", width=" + width + ", area=" + area + "]";
	}

	public boolean equals(Object obj) {
		boolean equals = false;
		Rectangle other = (Rectangle) obj;
		if(other.getArea() == this.getArea())
			if(other.getFillColour().equalsIgnoreCase(this.getFillColour()))
				if(other.getLineColour().equalsIgnoreCase(this.getLineColour()))
					if(other.getArea() == this.getArea())
						if(other.getWidth() == this.width)
							if(other.getLenght() == this.lenght)
								equals = true;
		return equals;
	}
	
	/***************************************************************
    *Purpose: clone method
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public Rectangle clone()
	{
		return new Rectangle(this);
	}
	
	/***************************************************************
    *Purpose: lenght validator 
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	private double validateLenght(double length)
	{
		if(length < 0) 
			throw new IllegalArgumentException("length can't be less than 0");
		return length;
	}
	
	private double validateWidth(double width)
	{
		if(width < 0) 
			throw new IllegalArgumentException("width can't be less than 0");
		return width;
	}
	
	
}