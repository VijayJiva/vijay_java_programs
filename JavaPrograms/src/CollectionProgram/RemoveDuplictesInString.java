package CollectionProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplictesInString {

	public static void main(String[] args) 
	{
		String name = "vijayakumar";
		removeDup(name);
		

	}

	private static void removeDup(String name)
	{
		LinkedHashSet<Character> has = new LinkedHashSet<>();
		String s = "";
		char[] ch = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			has.add(ch[i]);
		}
		
		for(Character c : has) {
			
			int count = 0;
			for (int i = 0; i < ch.length; i++) 
			{
				
				if(c.equals(ch[i]))
					count++;
				
			}
		if(count<=1)
		System.out.println(c + " has number of..."+ count);}
			
		}
		
		

}
