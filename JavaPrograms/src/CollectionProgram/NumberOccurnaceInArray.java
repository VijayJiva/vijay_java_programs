package CollectionProgram;

public class NumberOccurnaceInArray {

	public static void main(String[] args)
	{
	
		Integer [] a = {2,1,2,4,1,9,0,12,2323,121};
		
		int dup = noOfDup(a);
		System.out.println("Number of Duplicates = " + dup);
		Integer [] b = removeDuplicates(a);
		
		for(Integer i : b)
		{
			if(i!=null)
			System.out.print(i + " ");
			}
		
		
	}
	
	

	private static int noOfDup(Integer[] a) 
	{
		
		int count = 0;
		for(int i = 0; i < a.length ; i ++)
			for(int j = i +1 ; j < a.length ; j++)
				if(a[i] == a[j])
					count++;	
		return count;
	}



	private static Integer[] removeDuplicates(Integer[] a) 
	{	
		Integer[] ret = new Integer[a.length];
		for(int i = 0; i < a.length ; i ++)
		{
			for(int j = i +1 ; j < a.length ; j++)
			{
				if(a[i] == a[j])
					a[j] = null;
				
				
			}
			
			
		}
		return a;
	}

}
