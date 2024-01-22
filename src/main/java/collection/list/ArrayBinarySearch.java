package collection.list;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) {

		int [] a= {10,5,20,11,6};
		
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a,6));
		System.out.println(Arrays.binarySearch(a, 14));
		
		String [] s= {"A","Z","B"};
		
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s, "B"));
		System.out.println(Arrays.binarySearch(s, "S"));
		
		Arrays.sort(s,new ArrayComparator());
		System.out.println(Arrays.binarySearch(s, "z",new ArrayComparator() ));
		System.out.println(Arrays.binarySearch(s, "G",new ArrayComparator() ));
		System.out.println(Arrays.binarySearch(s, "K"));
		
		
	}

}
