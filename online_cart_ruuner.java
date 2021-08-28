package think;

public class online_cart_ruuner 
{
		public static void main(String args[])
		{
			online_cart c1 = new online_cart("pen",10);
			c1.add_cart(); 
		    c1.setProduct("pen");
			//System.out.println(c1);
			System.out.println(c1.getProduct());
			c1.setAmount(10);
			//System.out.println(c1);
			System.out.println(c1.getAmount());
			c1.update_cart();
			
		}

}
