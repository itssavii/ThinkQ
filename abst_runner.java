package think;

public class abst_runner 
{
	public static void main(String args[])
	{
		abs_animal a1= new cat();
		abs_animal a2= new dog();
		abs_animal[]a3= {new cat(),new dog()};
		a3[0].bark();
		a3[1].bark();
		a3[0].skin();
	}
}
