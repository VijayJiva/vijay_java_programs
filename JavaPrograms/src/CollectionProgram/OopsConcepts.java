package CollectionProgram;

class Parent{
	
	public  void print() {
		System.out.println("Printing");
	}
}

class Child extends Parent
{
	
}

public class OopsConcepts extends Parent

{

	public static void main(String[] args) 
	{
		Child c = new Child();
		c.print();
		
		OopsConcepts o = new OopsConcepts() ;
		o.print();
	}

}
