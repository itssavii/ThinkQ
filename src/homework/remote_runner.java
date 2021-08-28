package homework;

public class remote_runner 
{
	public static void main(String args[])
	{
		remote_impl r1 = new remote_impl();
		r1.on();
		r1.off();
		r1.inc();
		r1.dec();
	}

}
