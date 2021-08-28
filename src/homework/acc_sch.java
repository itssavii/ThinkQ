package homework;

public class acc_sch extends acc_stud
{
	private String name;
	
	acc_sch(int rollno,String name)
	{
		super(rollno);
		this.name = name;
	}
	public static void pvt_msg()
	{
		System.out.println("This is private class");
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
}
