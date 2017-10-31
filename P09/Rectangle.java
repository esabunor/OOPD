import java.util.*;

/***************************************************************
*Date: Tues 15th August                                       *
*Author: Tega Esabunor-Nukie 19048895                         *
*Activity: worksheet 8                                        *
***************************************************************/  
public class Rectangle
{
	private Double lenght;
	private Double width;
	private Double area;
	
	/***************************************************************
    *Purpose: Default constructor               
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public Rectangle()
	{
		this.lenght = 0.0;
		this.width = 0.0;
		this.area = 0.0;
	}
	
	/***************************************************************
    *Purpose: alternate constructor               
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public Rectangle(Double lenght, Double width)
	{
		this.lenght = lenght;
		this.width = width;
		setArea(calcArea(lenght, width));
	}
	
	/***************************************************************
    *Purpose: copy constructor               
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public Rectangle(Rectangle inRect)
	{
		lenght = inRect.getLenght();
		width = inRect.getWidth();
		area = inRect.getArea();
		
	}
	
	/***************************************************************
    *Purpose: calculate area               
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	private Double calcArea(Double lenght, Double width) 
	{
		return lenght * width;
	}

	public Double getLenght() 
	{
		return lenght;
	}

	public Double getWidth() 
	{
		return width;
	}

	public Double getArea() 
	{
		return area;
	}

	public void setLenght(Double lenght) 
	{
		this.lenght = validateLenght(lenght);
	}

	public void setWidth(Double width) 
	{
		this.width = validateWidth(width);
	}

	public void setArea(Double area) 
	{
		this.area = area;
	}

	public String toString() 
	{
		return "Rectangle [lenght=" + lenght + ", width=" + width + ", area=" + area + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (lenght == null) {
			if (other.lenght != null)
				return false;
		} else if (!lenght.equals(other.lenght))
			return false;
		if (width == null) {
			if (other.width != null)
				return false;
		} else if (!width.equals(other.width))
			return false;
		return true;
	}
	
	public Rectangle clone()
	{
		return new Rectangle(this);
	}
	
	private Double validateLenght(Double length)
	{
		if(length < 0) 
			throw new IllegalArgumentException("length can't be less than 0");
		return length;
	}
	
	private Double validateWidth(Double width)
	{
		if(width < 0) 
			throw new IllegalArgumentException("width can't be less than 0");
		return width;
	}
	
	
}