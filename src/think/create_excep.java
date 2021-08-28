package think;

public class create_excep 
{
	public void sum1()
	{
		sum2();
		int data=100/0;  
		System.out.println("method is done");
	}
	public void sum2()
	{
		System.out.println("method 2 is done");
	}
	public static void main(String args[])
	{
		System.out.println("welocome to main method");
		create_excep c1= new create_excep ();
		c1.sum1();
		c1.sum2();
	}
}
