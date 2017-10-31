import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class StudentClassTest 
{
	@Test
	public void testConstruction()
	{
		Student std = new Student();
		assertEquals(0.0, std.getMark());
	}
	
	@Test
	public void testCloning()
	{
		Student std, std1;
		std = new Student();
		std1 = std.clone();
		assertEquals(std, std1);
	}
	
	@Test 
	public void testCopyConstructor()
	{
		Student std, std1;
		std = new Student(18.0, "teag");
		assertEquals(18.0, std.getMark());
	}
	
	@Test
	public void testValidation()
	{
		Student std = new Student();
		std.setMark(-1.0);//should throw an illegalargument exceptoin
	}
	
	@Test
	public void testToStringMethod()
	{
		Student std = new Student();
		assertEquals("Student [name=blank, mark=0]", std.toString());
	}
	
	@Test
	public void testNameValidation()
	{
		Student std = new Student();
		std.setName("");//should throw an illegalargument exception
	}
}
