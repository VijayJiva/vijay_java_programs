package CollectionProgram;

import java.util.*;

class Book
{
	int id;
	double price;
	String name;
	
	public Book() {}
	
	public Book(int id, double price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", name=" + name + "]";
	}
	
	
	
}

public class Collection_Comparator_Practice {

		public static void main(String[] args) 
	{
		List<Book> book = new ArrayList<Book>();
		book.add(new Book(001,525.4,"Harry Potter"));
		book.add(new Book(002,250,"Twilight"));
		book.add(new Book(000, 678, "Lord of the rings"));
		
		book.sort(new SortbyPrice());
		System.out.println("Books sorted by price");
		for(Book b : book)
			System.out.println(b);
		
		book.sort(new SortByName());
		System.out.println("\nBooks sorted by name");
		for(Book b : book)
			System.out.println(b);
		

	}

}

class SortbyPrice implements Comparator<Book>
{
	
	@Override
	public int compare(Book o1, Book o2) {
		
		return (int) (o1.price - o2.price);
		
	}
}

class SortByName implements Comparator<Book>
{

	@Override
	public int compare(Book o1, Book o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}
