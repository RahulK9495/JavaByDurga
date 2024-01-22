package collection.list;

import java.util.TreeSet;

public class TreeSetStringBuffer {
	
	

	public static void main(String[] args) {

		MyComparatorStringBuffer msb=new MyComparatorStringBuffer();
		
		StringBuffer one=new StringBuffer("One");
		StringBuffer two=new StringBuffer("zero");
		StringBuffer three=new StringBuffer("Three");
		
		TreeSet<StringBuffer> t=new TreeSet<StringBuffer>(msb);
		t.add(one);
		t.add(two);
		t.add(three);
		
		
		System.out.println(t);
	}

}
