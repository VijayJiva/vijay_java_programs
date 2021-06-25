package CollectionProgram;

import java.util.LinkedHashSet;

public class RemoveDupInSentence {
	
	public static void main(String[] args) {
		
		String sen = "Vijay is my name, my name has victory meaning to it";
		
		String[] words = sen.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < words.length; i++) {
			set.add(words[i]);
		}
		for(String word : set)
			System.out.print(word + " ");
	}

}
