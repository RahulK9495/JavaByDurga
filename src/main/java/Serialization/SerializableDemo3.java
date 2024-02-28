package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo3 {

	public static void main(String[] args) throws Exception {

		Tiger t=new Tiger();
		t.i=888;
		t.j=999;
		
		FileOutputStream fos=new FileOutputStream("tiger.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(t);
		
		FileInputStream fis=new FileInputStream("tiger.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Tiger t1=(Tiger)ois.readObject();
		
		System.out.println(t1.i+"...."+t1.j);
		
		
		
	}

}
