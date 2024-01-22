package collection.list;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs=new HashSet();
		
		hs.add("A");
		hs.add("C");
		hs.add("B");
		hs.add("A");
		hs.add(null);
		hs.add(20);
		System.out.println(hs.add("A"));
		System.out.println(hs);
		
	}

}
