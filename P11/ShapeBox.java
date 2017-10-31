import java.io.*;
import java.util.*;

/***************************************************************
*Date: Mon 30 October                                       *
*Author: Tega Esabunor-Nukie 19048895                         *
*Activity: worksheet 8                                        *
***************************************************************/  
public class ShapeBox 
{
	private static final int MAX_SHAPE = 10;
	private Shape[] shapes;
	private int numShapes;
	private boolean constructed = false;
	
	/***************************************************************
    *Purpose: Default constructor               
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public ShapeBox()
	{
		this.shapes = new Shape[MAX_SHAPE];
		this.numShapes = 0;
		this.constructed = false;
	}
	
	/***************************************************************
    *Purpose: alternate constructor
    *Date: Tues 15th Septem                                       
    *Import: filename
    ****************************************************************/
	public ShapeBox(String filename)
	{
		this.shapes = makeShapes(filename);
		this.numShapes = getNoOfLines(filename);
		this.constructed = true;
	}
	
	/***************************************************************
    *Purpose: alternate constructor
    *Date: Tues 15th Septem                                       
    *Import: shapes and count
    ****************************************************************/
	public ShapeBox(Shape[] shapes, int count)
	{
		this.shapes = shapes;
		this.numShapes = count;
		this.constructed = false;
	}
	
	/***************************************************************
    *Purpose: copy constructor
    *Date: Tues 15th Septem                                       
    *Import: shapebox
    ****************************************************************/
	public ShapeBox(ShapeBox shapeBox)
	{
		this.shapes = shapeBox.getShapes();
		this.numShapes = shapeBox.getNumShapes();
		this.constructed = shapeBox.isConstructed();
	}
	
	/***************************************************************
    *Purpose: constructed accessor
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public boolean isConstructed()
	{
		return constructed;
	}

	/***************************************************************
    *Purpose: copyShapes accessor
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public Shape[] getShapes() 
	{	
		Shape[] copyShapes = new Shape[MAX_SHAPE];
		for(int i = 0; i < this.numShapes; i++)
			copyShapes[i] = shapes[i].clone();
		return copyShapes;
	}

	/***************************************************************
    *Purpose: numShapes accessor
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public int getNumShapes() 
	{
		return numShapes;
	}

	/***************************************************************
    *Purpose: height mutator
    *Date: Tues 15th Septem                                       
    *Import: beight                        
    ****************************************************************/
	public void setShapes(Shape[] shapes) 
	{
		this.shapes = new Shape[MAX_SHAPE];
		for(int i = 0; i < MAX_SHAPE; i++)
			this.shapes[i] = shapes[i].clone();
	}

	/***************************************************************
    *Purpose: height mutator
    *Date: Tues 15th Septem                                       
    *Import: beight                        
    ****************************************************************/
	public void setNumShapes(int numShapes) 
	{
		this.numShapes = numShapes;
	}
	
	/***************************************************************
    *Purpose: to add shapes
    *Date: Tues 15th Septem                                       
    *Import: beight                        
    ****************************************************************/
	public void addShape(Shape shape) throws IllegalAccessException
	{
		if(!constructed)
			throw new IllegalAccessException("Shapes has not been constructed");
		this.numShapes++;
		this.shapes[this.numShapes] = shape;
	}

	/***************************************************************
    *Purpose: makeshapes
    *Date: Tues 15th Septem                                       
    *Import: beight                        
    ****************************************************************/
	public static Shape[] makeShapes(String filename) {
		Shape[] shapes = new Shape[MAX_SHAPE];
		char shapeType = ' ';
		BufferedReader bufRdr = doFileOpening(filename);
		String line = "";
		int lineNo = 0;
		try 
		{
			line = bufRdr.readLine();
		} 
		catch (IOException e1) 
		{
			System.out.println(e1.getMessage());
		}
		while(line != null)
		{	
			String[] tokens = line.split(",");
			shapeType = tokens[0].charAt(0);
			switch(shapeType)
			{
			case 'R':
				shapes[lineNo] = constructRectangle(tokens);
				break;
			case 'C':
				
				shapes[lineNo] = constructCircle(tokens);
				break;
			case 'T':
				
				shapes[lineNo] = constructTriangle(tokens);
				break;
			default:
				System.out.println("Error infile format in line" + lineNo);
			}
				
			try 
			{
				line = bufRdr.readLine();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
			lineNo++;
		}
		
		return shapes;
	}
	
	public static BufferedReader doFileOpening(String filename)
	{
		
		FileInputStream fileIns = null;
		BufferedReader bufRdr = null;
		InputStreamReader rdr = null;
		try 
		{
			fileIns = new FileInputStream(filename);
			rdr = new InputStreamReader(fileIns);
			bufRdr = new BufferedReader(rdr);
			
		} 
		catch (IOException e) 
		{
			System.out.println("Error while reading file" + e.getMessage());
		}
		return bufRdr;
	}
	
	/***************************************************************
    *Purpose: constructs a circle instance
    *Date: Tues 15th Septem                                       
    *Import: beight                        
    ****************************************************************/
	public static Circle constructCircle(String[] tokens)
	{
		int diam = Integer.valueOf(tokens[1]);
		return new Circle(diam);
	}
	
	/***************************************************************
    *Purpose: constructs a triangle instance
    *Date: Tues 15th Septem                                       
    *Import: beight                        
    ****************************************************************/
	public static Triangle constructTriangle(String[] tokens)
	{
		double basetri = Double.valueOf(tokens[1]);
		double heighttri = Double.valueOf(tokens[2]);
		return new Triangle(basetri, heighttri);
	}
	
	/***************************************************************
    *Purpose: constructs a rectangel instance
    *Date: Tues 15th Septem                                       
    *Import: beight                        
    ****************************************************************/
	public static Rectangle constructRectangle(String[] tokens)
	{
		double base = Double.valueOf(tokens[1]);
		double height = Double.valueOf(tokens[2]);
		return new Rectangle(base, height);
	}
	
	/***************************************************************
    *Purpose: gets number of lines in file
    *Date: Tues 15th Septem                                       
    *Import: beight                        
    ****************************************************************/
	public static int getNoOfLines(String filename)
	{
		BufferedReader bufRdr = doFileOpening(filename);
		String line = "";
		try 
		{
			line = bufRdr.readLine();
		} 
		catch (IOException e1) 
		{
			System.out.println(e1.getMessage());
		}
		int lineNo = 0;
		
		while(line != null)
		{
			lineNo++;
			try 
			{
				line = bufRdr.readLine();
			} 
			catch (IOException e) 
			{
				System.out.println("Error in reading file " + e.getMessage());
			}
		}
		return lineNo;
	}
	
	/***************************************************************
    *Purpose: toString method
    *Date: Tues 15th Septem                                       
    *Import: beight                        
    ****************************************************************/
	public String toString()
	{	
		String toString = "";
		for(int i = 0; i < numShapes; i++)
			toString += "\n" + shapes[i].toString();
		return toString;
	}
	
	/***************************************************************
    *Purpose: clone method
    *Date: Tues 15th Septem                                       
    *Import: beight                        
    ****************************************************************/
	public ShapeBox clone()
	{
		return new ShapeBox(this);
	}
	
	public boolean equals(Object obj)
	{
		boolean isEquals = false;
		ShapeBox sBox = (ShapeBox) obj;
		if(this.numShapes == sBox.getNumShapes())
			if(this.constructed == sBox.isConstructed())
			{
				boolean shapesEquals = true;
				for(int i = 0; i < this.numShapes && shapesEquals ; i++)
				{
					if(!sBox.getShapes()[i].equals(this.shapes[i]))
						shapesEquals = false;
				}
				if(shapesEquals)
					isEquals = true;
			}
				
		return isEquals;
	}

}
