import java.util.*;
import java.io.*;
/***************************************************************
*Date: Tues 15th Septem                                       *
*Author: Tega Esabunor-Nukie 19048895                         *
*Activity: worksheet 8                                        *
***************************************************************/  
public class Question1 
{
	public static void main(String[] args)
	{
		Double[] arrScores = null;
		String[] arrNames = null;
		populateArrays("marks_file.csv", arrNames, arrScores);
		displayMenu(arrNames, arrScores);//display the menu

	}
	
	/***************************************************************
    *Purpose: To processes each line                              *
    *Date: Tues 15th Septem                                        *
    *Import: none                                                  *
    *Export: none                                                  *
    *Assertion:                                                    *
    ***************************************************************/
	public static void processLine(String csvRow, String[] arrayOfNames, Double[] arrayOfScores, int lineNumber)
	{
		String thisToken;
		StringTokenizer tokeniser = new StringTokenizer(csvRow, ",");
		for(int i = 0; tokeniser.hasMoreTokens(); i++)
		{	
			thisToken = tokeniser.nextToken();
			if(i == 0)
				arrayOfNames[lineNumber - 1] = thisToken;
			else
				arrayOfScores[lineNumber - 1] = Double.valueOf(thisToken);
		}
	}
	
	/***************************************************************
    *Purpose: To get the number of lines in the file              *
    *Date: Tues 15th Septem                                        *
    *Import: filename                                              *
    *Export: none                                                  *
    *Assertion:                                                    *
    ***************************************************************/
	public static int getNumLines(String filename)
	{	
		FileInputStream fileIns = null;
		int lineNum = 0;
		String line;
		try {
			fileIns = new FileInputStream(filename);
			InputStreamReader rdr = new InputStreamReader(fileIns);
			BufferedReader bufRdr = new BufferedReader(rdr);
			lineNum = 0;
			line = bufRdr.readLine();
			while(line != null)
			{
				lineNum++;
				line = bufRdr.readLine();
			}
			fileIns.close();
		} catch (IOException e) {
			if(fileIns != null)
				try {
					fileIns.close();
				} catch (IOException e1) {
					System.out.println(e.getMessage());
				}
			System.out.println("Error while reading file" + e.getMessage());
		}
		return lineNum;
	}
	
	/***************************************************************
    *Purpose: To populate arrayofnames and arrayofscores            *
    *Date: Tues 15th Septem                                        *
    *Import: arry of name and arr of scores                        *
    *Export: none                                                  *
    *Assertion:                                                    *
    ***************************************************************/
	public static void populateArrays(String filename, String[] arrayOfNames, Double[] arrayOfScores)
	{
		int numLines = getNumLines(filename);
		arrayOfNames = new String[numLines];
		arrayOfScores = new Double[numLines];
		
		FileInputStream fileIns = null;
		String line;
		try {
			fileIns = new FileInputStream(filename);
			InputStreamReader rdr = new InputStreamReader(fileIns);
			BufferedReader bufRdr = new BufferedReader(rdr);
			for(int i = 1; i <= numLines; i++)
			{
				processLine(bufRdr.readLine(), arrayOfNames, arrayOfScores, i);
			}
			fileIns.close();
		} catch (IOException e) {
			if(fileIns != null)
				try {
					fileIns.close();
				} catch (IOException e1) {
					System.out.println(e.getMessage());
				}
			System.out.println("Error while reading file" + e.getMessage());
		}
		
	}
	
	/***************************************************************
    *Purpose: Displays the programs menu                           *
    *Date: Tues 15th Septem                                        *
    *Import: arry of name and arr of scores                                                    *
    *Export: none                                                  *
    *Assertion:                                                    *
    ***************************************************************/
	public static void displayMenu(String[] arrayOfNames, Double[] arrayOfScores)
	{
		System.out.println("Select an option");
		System.out.println("!.Display mark");
		System.out.println("2.Exit");
		int choice = validateInput(arrayOfNames, arrayOfScores);
		if (choice == 1)
			search(arrayOfNames, arrayOfScores);
	}
	
	/***************************************************************
    *Purpose: To search the file for a name                        *
    *Date: Tues 15th Septem                                        *
    *Import: arry of name and arr of scores                        *
    *Export: none                                                  *
    *Assertion:                                                    *
    ***************************************************************/
	public static void search(String[] arrayOfNames, Double[] arrayOfScores) 
	{
		System.out.println("Please provide the name of the student");
		Scanner scn = new Scanner(System.in);
		String name = scn.next();
		int index = -1;
		for(int i = 0; i < arrayOfNames.length; i++)
		{
			if (arrayOfNames[i].equalsIgnoreCase(name))
				index = 1;
			
		}
		if(index == -1)
			System.out.println("No results found");
		else
			System.out.println(arrayOfNames[index] + " mark is " + arrayOfScores[index]);
		displayMenu(arrayOfNames, arrayOfScores);
	}
	
	/***************************************************************
    *Purpose: To validate users menu selection input               *
    *Date: Tues 15th Septem                                        *
    *Import: arry of name and arr of scores                        *
    *Export: none                                                  *
    *Assertion:                                                    *
    ***************************************************************/
	public static int validateInput(String[] arrayOfNames, Double[] arrayOfScores) 
	{
		Scanner scn = new Scanner(System.in);
		int choice = scn.nextInt();
		while (choice != 1 || choice != 2)
		{
			System.out.println("Invalid Choice");
			displayMenu(arrayOfNames, arrayOfScores);
			choice = scn.nextInt();
		}
		return choice;
	}
}
