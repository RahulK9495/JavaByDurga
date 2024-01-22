package collection.list;

import java.util.Comparator;

public class MyComparator implements Comparator{

	public int compare(Object o1, Object o2) {

	Integer I1= (Integer)o1;
	Integer I2= (Integer)o2;
	
	/*
	 * if (I1>I2) return 1; else if (I1<I2) return -1; else return 0;
	 */
	
//	return -I1.compareTo(I2);
//	return I2.compareTo(I1);
	return +1;
	}
	

}
