package think;

public class animal 
{
	private boolean wild;
	private int noOfLegs;
	animal(boolean wild, int legs)
	{
		this.wild = wild;
		this.noOfLegs = legs;
	}
	public boolean isWild() 
	{
		return wild;
	}

	public void setWild(boolean wild) 
	{
		this.wild = wild;
	}
	public int getNoOfLegs() 
	{
		return noOfLegs;
	}
	public void setNoOfLegs(int noOfLegs) 
	{
		this.noOfLegs = noOfLegs;
	}
}
