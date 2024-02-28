package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustSerializableDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {


	
		Account a1=new Account();
		
		System.out.println(a1.username+"......."+a1.pwd);
		FileOutputStream fos=new FileOutputStream("newfile.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		FileInputStream fis=new FileInputStream("newfile.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account a3= (Account)ois.readObject();
		System.out.println(a3.username+"......."+a3.pwd);
		
	}

}
