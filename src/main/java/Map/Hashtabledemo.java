package Map;

import java.util.Hashtable;

public class Hashtabledemo {

	public static void main(String[] args) {


		Hashtable h=new Hashtable();
		h.put(new temp(5), "A");
		h.put(new temp(2), "B");
		h.put(new temp(6), "C");
		h.put(new temp(15), "D");
		h.put(new temp(23), "E");
		h.put(new temp(16), "F");
		
		System.out.println(h);
		
	}

}
