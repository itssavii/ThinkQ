package think;

public class handle_eecep 
{
	public static void main(String args[])
	{
		try
		{
			int data=100/0;  
			System.out.println("method is done");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("there is an exception");
		}
	
		System.out.println("welocome to main method");
	}
		
}

