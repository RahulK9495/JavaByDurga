package collection.list;

public class Employee implements Comparable {

	String name;
	int empid;

	
	public Employee(String name, int empid) {
		super();
		this.name = name;
		this.empid = empid;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + "]";
	}

	public int compareTo(Object o) {
		
		int id1=this.empid;
		Employee e= (Employee)o;
		int id2 =e.empid;
		
		if(id1<id2)
			return-1;
		else if (id1>id2)
			return 1;
		else
			return 0;
		
	}

	
}
