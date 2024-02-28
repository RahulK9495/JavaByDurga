package Serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {
	
	String username ="Durga";
	transient String pwd ="Anushka";
	transient int pin = 1234;

	private void writeObject (ObjectOutputStream os) throws Exception
	{
		os.defaultWriteObject();
		String epwd ="123"+pwd;
		os.writeObject(epwd);
		int epin=4444+pin;
		os.writeObject(pin);
	}
	private void readObject (ObjectInputStream is) throws Exception
	{
		is.defaultReadObject();
		String epwd =(String)is.readObject();
		pwd=epwd.substring(3);
		int epin=(int)is.readInt();
		pin=epin-4444;
	}
}
