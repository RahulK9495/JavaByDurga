package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo2 {

	public static void main(String[] args) throws Exception {

		
		Dog d1=new Dog();
		Cat c1=new Cat();
		
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Object o=ois.readObject();
		
		while(o !=null)
		{
			if (o instanceof Dog)
			{
				Dog d2=(Dog)o;
				System.out.println(d2.i);
			}
			ois.readObject();
		}
		
//		System.out.println(d2.i+"........"+d2.j);
		
	}

}
