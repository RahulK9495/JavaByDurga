package Serialization;

import java.io.Serializable;

public class Dog implements Serializable {
	
	transient final int i=10;
	static transient int j=20;

}
