package CollectionProgram;

@FunctionalInterface
interface Cab
{
	public void book();
	
	public static void print()
	{
		System.out.println("Hi world");
	}
	
	default void see()
	{
		System.out.println("Hello");
	}
	
}



public class Lamba_Class {

	public static void main(String[] args) 
	{
		
		Cab c = ()-> System.out.println("OLA cab booked...");
		c.book();

	}

}
