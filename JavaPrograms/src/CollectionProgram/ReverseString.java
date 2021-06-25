package CollectionProgram;

public class ReverseString {

	public static void main(String[] args)
	{
		String s = "my name is vijay";
		String r = reverse(s);
		System.out.println(r);
		
	}

	private static String reverse(String s)
	{
		String r = "";
		for(int i = s.length()-1; i>=0;i--)
		{
			r = r + s.charAt(i);
		}
		
		return r;
	}

}
