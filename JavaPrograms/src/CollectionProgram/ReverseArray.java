package CollectionProgram;

public class ReverseArray 
{
	public static void main(String[] args) throws Exception
	{
		Integer [] i = {1,2,3,4};
		Integer [] r = reverse(i);
		
		for(Integer x : r)
			System.out.println(x);
		

}
	

	private static Integer[] reverse(Integer[] i)
	{
		Integer[] reverse = new Integer[i.length];
		
		for(int j= i.length-1,k=0 ; j >= 0 ; j--,k++)
		{
			reverse[k] = i[j];
		}
		
		return reverse;
	}
	
}
