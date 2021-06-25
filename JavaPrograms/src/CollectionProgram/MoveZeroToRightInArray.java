package CollectionProgram;

import java.util.*;


public class MoveZeroToRightInArray {
	
	

	public static void main(String[] args)
	{
		int [] a = {0,1,0,3,4,0,1,0,4,0,0};
		int[] b = getZeroonRight(a);
		for(int i : b)
			System.out.print(i + " ");
		int[] c = getZeroOnLeft(a);
		System.out.println();
		for(int i : c)
			System.out.print(i + " ");
		
		

	}

	private static int[] getZeroOnLeft(int[] a)
	{
		ArrayList <Integer> c = new ArrayList();
		int count = 0;
		ArrayList <Integer> temp = new ArrayList();
		//int[] ret = new int[a.length];
		
		for(int i : a)
			
			if(i==0) 
			{
				
				c.add(i);
			}
			else
				temp.add(i);
				
		
		c.addAll(temp);
		System.out.println("\n"+c.toString());
		
		for(int i = 0 ; i >= c.size(); i++)
			a[i] = c.get(i);
		
		return a;
	}

	private static int[] getZeroonRight(int[] a)
	{
		int[] c = new int[a.length];
		int count = 0;
		
		for(int i : a)
		
			if(i!=0) 
			{
				c[count++] = i;
			}
				
		
		
		return c;
	}

}
