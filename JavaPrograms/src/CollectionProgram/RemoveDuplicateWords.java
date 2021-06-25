package CollectionProgram;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		
		String sen = "Game of Thrones has the worst final season worst";
		String[] splited = sen.split(" ");
		LinkedHashSet <String> has = new LinkedHashSet<>();
		for (int i = 0; i < splited.length; i++) 
			has.add(splited[i]);
		System.out.println(has);
		
		for(String word : has) {
			int count = 0;
			for (int i = 0; i < splited.length; i++) {
				if(word.equals(splited[i]))
					count++;
			}
			if(count<=1)
			System.out.print(word + " ");
		}
		
	}
}
