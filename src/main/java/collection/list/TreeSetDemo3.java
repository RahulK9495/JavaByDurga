package collection.list;

import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {

		MyComparatorStringBuffer3 msb=new MyComparatorStringBuffer3();
		
		StringBuffer one=new StringBuffer("ABC");
		StringBuffer two=new StringBuffer("AA");
		StringBuffer three=new StringBuffer("Three");
		
		TreeSet t=new TreeSet(msb);
		t.add("A");
		t.add(one);
		t.add(two);
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		
		
		System.out.println(t);
	}

}
