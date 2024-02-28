package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CarSerialization {

	public static void main(String[] args) throws Exception {

		Car c=new Car();
		

		FileOutputStream fos=new FileOutputStream("Cardemo.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c);
		System.out.println("Car serializad successfully");
	}

}
