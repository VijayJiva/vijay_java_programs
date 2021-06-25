package CollectionProgram;

public class CountNoOfwordsinString {

	public static void main(String[] args) {
		
		String sen = "Hi my is name is vijay my";
		int count = countOfWords(sen);
		System.out.println(count);
		int dup = countOfDup(sen);
		System.out.println(dup);

	}

	private static int countOfDup(String sen) {
		int dupl = 0;
		String[] c = sen.split(" ");
		for(int i = 0; i<c.length ; i++)
			for(int j = i + 1; j< c.length; j++)
				if(c[i].equals(c[j]))
					dupl++;
		return dupl;
	}

	private static int countOfWords(String sen)
	{
		String [] c = sen.split(" ");
		return c.length;
		
	}

}
