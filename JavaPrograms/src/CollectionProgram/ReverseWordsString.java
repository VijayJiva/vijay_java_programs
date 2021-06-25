package CollectionProgram;

public class ReverseWordsString {

	public static void main(String[] args) {
		
		String sen = "Hi I love forest";
		String rev = revWords(sen);
		System.out.println(rev);
		System.out.println("The End");
		
	}

	private static String revWords(String sen)
	{
		String [] split = sen.split(" ");
		String rev = "";
	
		
		for(int i = 0; i < split.length; i ++)	
		{
			String r = split[i];
			for(int j = r.length()-1; i >= 0 ; i--)
				rev = rev + r.charAt(j);
			
			rev = rev + " ";	
			
		}
			
		
		return rev;
	}
	
	

}
