package think;

public class online_cart 
{
	private String product;
	private int amount;
	
	online_cart(String product,int amount)
	{
		this.product = product;
		this.amount = amount;
		
		
	}
	
	void add_cart()
	{
		System.out.println("Product Is Added TO Cart");
		
	}
	void update_cart()
	{
		System.out.println("Your Cart is Updated");
		
	}

	public String getProduct() 
	{
		return product;
	}

	public void setProduct(String product) 
	{
		this.product = product;
	}

	public int getAmount() 
	{
		return amount;
	}

	public void setAmount(int amount) 
	{
		this.amount = amount;
	}

}
