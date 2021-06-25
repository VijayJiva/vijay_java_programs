package CollectionProgram;

import java.util.LinkedHashSet;

public class RemoveDupCharString {
	
	public static void main(String[] args) {
		String word = "hello";
		char[] ch = word.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		for(char w:set)
			System.out.print(w);
			
	}

}
