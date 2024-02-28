package Serialization;

import java.io.Serializable;

public class Tiger extends Animal implements Serializable{
	
	int j=40;

	public Tiger() {
		super();

		System.out.println("child class constructor excuted...");
	}

	
}
