import java.util.*;

/***************************************************************
*Date: Tues 15th August                                       *
*Author: Tega Esabunor-Nukie 19048895                         *
*Activity: worksheet 8                                        *
***************************************************************/  
public class Triangle 
{
	private Double base;
	private Double height;
	private Double area;
	
	
	public Triangle(Double base, Double height) 
	{
		this.base = base;
		this.height = height;
		setArea(calcArea(base, height));
	}
	
	/***************************************************************
    *Purpose: Default constructor               
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public Triangle()
	{
		this.base = 0.0;
		this.height = 0.0;
		this.area = 0.0;
	}
	
	/***************************************************************
    *Purpose: copy constructor               
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public Triangle(Triangle inTriangle)
	{
		base = inTriangle.getBase();
		height = inTriangle.getHeight();
		area = inTriangle.getArea();
	}
	
	public Double getBase() 
	{
		return base;
	}
	
	/***************************************************************
    *Purpose: setter for base              
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public void setBase(Double base) 
	{
		this.base = validateWidth(base);
	}
	
	public Double getHeight() 
	{
		return height;
	}
	
	public void setHeight(Double height) 
	{
		this.height = validateHeight(height);
	}
	
	public Double getArea() 
	{
		return area;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (base == null) {
			if (other.base != null)
				return false;
		} else if (!base.equals(other.base))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		return true;
	}
	
	public String toString() 
	{
		return "Triangle [base=" + base + ", height=" + height + ", area=" + area + "]";
	}
	
	public void setArea(Double area) 
	{
		this.area = area;
	}
	
	private Double calcArea(Double base2, Double height2) 
	{
		return (0.5 * base * height)/100.0;
	}
	
	private Double validateHeight(Double height)
	{
		if(height < 0) 
			throw new IllegalArgumentException("height can't be less than 0");
		return height;
	}
	
	private Double validateWidth(Double width)
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
