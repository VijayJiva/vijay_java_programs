package CollectionProgram;

public class RemoveDuplictesInString {

	public static void main(String[] args) 
	{
		String name = "vijayakumar";
		String dumb = removeDup(name);
		System.out.println(dumb);

	}

	private static String removeDup(String name)
	{
		String ret = "";
		
		for(int i = 0; i<name.length();i++)
			for(int j = i+1 ; j<name.length();j++)
				if(name.charAt(i) == name.charAt(j))
				{
					name=null;
				}
		
		return null;
	}

}
