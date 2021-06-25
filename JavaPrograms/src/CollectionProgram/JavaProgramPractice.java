package CollectionProgram;

public class JavaProgramPractice
{
	public static void main(String[] args)
	{
		String name = "Vijay";
		printRevUsingCharArray(name);
		printRevUsingString(name);
		reverse(name);
		
		
	}
	
	private static void reverse(String s)
	{
		String r = "";
		for(int i = s.length()-1; i>=0;i--)
		{
			r = r + s.charAt(i);
		}
		
		System.out.println(r);
	}

	private static void printRevUsingString(String name) {
		String revs="";
		char[] rev = name.toCharArray();
		for (int i = rev.length-1; i >=0; i--)
			revs = revs + rev[i];
		System.out.println(revs);
		
		
		
	}

	private static void printRevUsingCharArray(String name) {
		char[] rev = name.toCharArray();
		for (int i = rev.length-1; i >=0; i--)
			System.out.print(rev[i]);
		System.out.println();
	}
}
