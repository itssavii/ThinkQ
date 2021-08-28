package homework;

public class stud_runner 
{
	public static void main(String args[])
	{
		acc_sch a1= new acc_sch(1,"Savita");
		System.out.println("Student roll numner  " + a1.getRollno());
		System.out.println("Student name " + a1.getName());
		a1.pub_msg();
		a1.pvt_msg();
	}

}
