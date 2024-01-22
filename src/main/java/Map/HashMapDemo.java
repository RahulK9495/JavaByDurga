package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap m=new HashMap ();
		m.put("Raja", 100);
		m.put("Durga", 600);
		m.put("Sonya", 500);
		m.put("raj", 800);
		System.out.println(m);
		
		System.out.println(m.put("Raja", 200));
		
		Set s=m.keySet();
		System.out.println(s);
		
		Collection c=m.values();
		System.out.println(c);
		
		Set s1=m.entrySet();
		System.out.println(s1);
		
		
		
		Iterator itr=s1.iterator();
		while (itr.hasNext())
		{
		Map.Entry m1=(Map.Entry)itr.next();
		
		System.out.println(m1.getKey()+"........"+m1.getValue());
		
		if(m1.getKey().equals("raj"))
		{
			m1.setValue(850);
		}
		
		}
		System.out.println(m);
	}

}
