package homework;

abstract class abs_loan 
{
	abstract public void cal_int();
	public void print()
	{
		System.out.println("Interest is 100%");
	}
}

class bank extends abs_loan
{
	public void cal_int()
	{
		System.out.println("loan interest in calculated");
	}
}
