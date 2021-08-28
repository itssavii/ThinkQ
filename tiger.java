package think;

public class tiger extends animal 
{
	private String height;
	private int age;
	tiger(boolean wild, int legs)
	{
		super(wild,legs);
		this.height="small";
		this.age = 12;
	}
	tiger(boolean wild, int legs,String height,int age)
	{
		super(wild, legs);
		this.height=height;
		this.age=age;
	}
	void roar()
	{
		System.out.println("Tiger is roar");	
	}
	public String getHeight() 
	{
		return height;
	}
	public void setHeight(String height) 
	{
		this.height = height;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
}
