package Test;

import homework.*;

public class prot_runner extends new_acc_check 
{
	public static void main(String args[])
	{
		new_acc_check a1=new new_acc_check();
		//a1.print_msg();//not executed bcoz method is default can not access to another package
		a1.prot_msg();//this method is protected;
	}

}
