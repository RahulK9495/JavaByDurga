package collection.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l=new LinkedList();
		
		l.add("Raj");
		l.add("RAhul");
		l.add("Om");
		l.add("varad");
		
		System.out.println(l);
		
		ListIterator itr= l.listIterator();
		
		while (itr.hasNext())
		{
			String s=(String)itr.next();
			
			if(s.equals("Om"))
			{
				itr.remove();
			}
			else if (s.equals("varad")) 
			{
				itr.add("nitin");
			}
			else if (s.equals("RAhul"))
			{
				itr.set("Rahul");
			}
		}
		System.out.println(l);
	}

}
