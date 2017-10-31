import java.util.*;

/***************************************************************
*Date: Tues 15th August                                       *
*Author: Tega Esabunor-Nukie 19048895                         *
*Activity: worksheet 8                                        *
***************************************************************/  
public class Circle 
{
	private int diameter;
	private Double area;
	
	/***************************************************************
    *Purpose: Default constructor               
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public Circle()
	{
		diameter = 0;
		area = 0.0;
	}

	public Circle(int diameter, Double area) 
	{
		this.diameter = diameter;
		setArea(calcArea(diameter));
	}

	public Circle(Circle inCircle)
	{
		diameter = inCircle.getDiameter();
		area = inCircle.getArea();
	}

	public int getDiameter() 
	{
		return diameter;
	}

	public Double getArea() 
	{
		return area;
	}

	public void setDiameter(int diameter) 
	{
		this.diameter = validateDiameter(diameter);
	}

	private int validateDiameter(int diameter) 
	{
		if(diameter < 0) 
			throw new IllegalArgumentException("diameter can't be less than 0");
		return diameter;
	}

	public void setArea(Double area) 
	{
		this.area = area;
	}
	
	public Circle clone()
	{
		return new Circle(this);
	}
	
	private Double calcArea(int diameter) 
	{
		return Math.PI * (Math.pow((double)diameter/2.0,2));
	}

	public String toString() 
	{
		return "Circle [diameter=" + diameter + ", area=" + area + "]";
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (diameter != other.diameter)
			return false;
		return true;
	}
	
	
}

