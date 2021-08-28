package homework;

public class acc_stud 
{
	private int rollno;
	acc_stud(int rollno)
	{
		System.out.println("Roll number is present");
		this.rollno = rollno;
	}
	public static void pub_msg()
	{
		System.out.println("This is public class");
	}
	public int getRollno() 
	{
		return rollno;
	}
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}
}

