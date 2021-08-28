package think;

public class In_tigerrunner 
{
	public static void main(String[] args) 
	{
		tiger t = new tiger(true , 4, "small", 12);
		t.roar();
		System.out.println("Tighe Is Wild " + t.isWild());
		System.out.println("Tiger has " + t.getNoOfLegs() + " legs.");
		System.out.println("Tiger is " + t.getHeight());
		System.out.println("Age of Tiger is " + t.getAge());
	}

}
