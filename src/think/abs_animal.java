package think;

abstract class abs_animal 
{
	abstract public void bark();
	public void skin()
	{
		System.out.println("Skin color to be given");
	}
	
}

class cat extends abs_animal
{
	public void bark()
	{
		System.out.println("meow meow");
	}
}

class dog extends abs_animal
{
	public void bark()
	{
	
		System.out.println("bhow bhow");
	}
}
