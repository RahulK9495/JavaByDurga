package collection.list;

import java.util.TreeSet;

public class EmployeeTreeSet {

	public static void main(String[] args) {
	
		
		Employee e1=new Employee("Ram", 100);
		Employee e2=new Employee("sham", 200);
		Employee e3=new Employee("hari", 500);
		Employee e4=new Employee("rahul", 300);
		
		EmployeeComparator ec=new EmployeeComparator();
		
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		
		System.out.println(t);
		TreeSet t1=new TreeSet(ec);
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		
		System.out.println(t1);
		
	}

}
