package Serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ExternalizationDemo implements Externalizable{

	String s ;
	int i ;
	int j;
	

	public ExternalizationDemo() {
		System.out.println("No arg constructor");
	}
	

	public ExternalizationDemo(String s, int i, int j) {
			this.s = s;
		this.i = i;
		this.j = j;
	}


	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(s);
		out.write(i);
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		String s=(String)in.readObject();
		i=in.readInt();
	}

	
	public static void main(String[] args) throws Exception {
		
		ExternalizationDemo t=new ExternalizationDemo("Durga",10,30);
		
		FileOutputStream fos=new FileOutputStream("Externaliz.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(t);
				
				
		FileInputStream fis=new FileInputStream("Externaliz.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ExternalizationDemo t2=(ExternalizationDemo)ois.readObject();
		
		System.out.println(t2.s+"...."+t2.i+"......"+t2.j);
		
		
		
	}
}
