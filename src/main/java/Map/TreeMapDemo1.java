package Map;

import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {


		TreeMap t=new TreeMap(new MyComparator());
		
		t.put("aaa",104);
		t.put("gggg",105);
		t.put("kkkk",101);
		t.put(109, 305);
		
		System.out.println(t);
	}

}
