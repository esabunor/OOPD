import java.util.*;

/***************************************************************
*Date: Tues 15th August                                       *
*Author: Tega Esabunor-Nukie 19048895                         *
*Activity: worksheet 8                                        *
***************************************************************/  
public class Student 
{
	private String name;
	private Double mark;
	
	/***************************************************************
    *Purpose: Default constructor               
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public Student()
	{
		name = "blank";
		mark = 0.0;
		
	}
	
	/***************************************************************
    *Purpose: alternate constructor               
    *Date: Tues 15th Septem                                       
    *Import: name and mark of student                        
    ****************************************************************/
	public Student(Double inMark, String inName)
	{
		name = inName;
		mark = inMark;
		
	}
	
	/***************************************************************
    *Purpose: copy constructor               
    *Date: Tues 15th Septem                                       
    *Import: a student object                        
    ****************************************************************/
	public Student(Student inStudent)
	{
		name = inStudent.getName();
		mark = inStudent.getMark();
	}
	
	/***************************************************************
    *Purpose: accessor for mark               
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/
	public Double getMark() 
	{
		return mark;
	}

	/***************************************************************
    *Purpose: accessor for name               
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/

	public String getName()
	{
		return name;
	
	}

	/***************************************************************
    *Purpose: mutator for mark               
    *Date: Tues 15th Septem                                       
    *Import: none                        
    ****************************************************************/

	public void setName(String name) 
	{
		this.name = name;
	}

	public void setMark(Double mark) 
	{
		this.mark = mark;
	}
	
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (mark == null) {
			if (other.mark != null)
				return false;
		} else if (!mark.equals(other.mark))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public Student clone()
	{
		return new Student(this);
	}

	public String toString() 
	{
		return "Student [name=" + name + ", mark=" + mark + "]";
	}
}