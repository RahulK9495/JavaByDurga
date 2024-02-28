package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CardeSerialization {

	public static void main(String[] args) throws Exception {

		

		FileInputStream fis=new FileInputStream("Cardemo.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Car c1=(Car)ois.readObject();
		
		System.out.println(c1.i+"...."+c1.j);
	}

}
