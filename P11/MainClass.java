import java.util.*;

public class MainClass 
{
	public static void main(String[] args)
	{
		ShapeBox box = null;
		System.out.println("Select from the following options");
		System.out.println("1. Contruct ShapeBox for file");
		System.out.println("2.Add a Shape to ShapeBpx ");
		System.out.println("3. Display Shapes in ShapeBox ");
		Scanner sc = new Scanner(System.in);
		int option = Integer.valueOf(sc.nextLine().trim());
		
		switch(option)
		{
		case 1:
			String filename = sc.nextLine();
			box = new ShapeBox(filename);
			break;
		case 2:
			if(box == null)
				throw new IllegalArgumentException("Box is not constructed");
			addShapes(box);
		default:
			System.out.println("You have choosen an invalid option");
		}
	}

	private static void addShapes(ShapeBox box) 
	{
		char shapeType;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the shape of in the format '<Shape Letter> <shape properties>");
		String[] tokens = sc.nextLine().split(",");
		shapeType = tokens[0].charAt(0);
		try
		{
			switch(shapeType)
			{
			case 'R':
				box.addShape(ShapeBox.constructRectangle(tokens));
				break;
			case 'C':
				box.addShape(ShapeBox.constructCircle(tokens));
				break;
			case 'T':
				box.addShape(ShapeBox.constructTriangle(tokens));
				break;
			default:
				System.out.println("An theres an error in the file format");
			}
		}
		catch (IllegalArgumentException | IllegalAccessException e)
		{
			System.out.println("An illegal argument was passed " + e.getMessage());
		}
	}
}
