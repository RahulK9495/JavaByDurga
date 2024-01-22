package collection.list;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		
		int[] a= {10,20,3,6,8,13};
		System.out.println("Premitive array before sort..");
		
		for(int a2 : a)
		{
			System.out.println(a2);
		}
		
		Arrays.sort(a);
		System.out.println("Premitives after sorting ...");
		
		for (int a2 :a)
		{
			System.out.println(a2);
		}
		
		String [] s= {"G","F","R","L"};
		
	System.out.println("Object array before sorting");
	
		for(String s2:s)
		{
			System.out.println(s2);
		}
		
		Arrays.sort(s,new ArrayComparator());
		
		System.out.println("Object array after sorting");
		
		for(String s2:s)
		{
			System.out.println(s2);
		}
	}

}
