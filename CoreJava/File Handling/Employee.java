package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Serialization and Deserialization
public class Employee implements Serializable {
	int id;
	String name;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee se = new Employee();
		se.id = 10;
		se.name = "Vansh";

		// FileOutPutStream
		System.out.println("Serialization Started......");

		FileOutputStream fos = new FileOutputStream("vansh.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(se);

		oos.close();
		fos.close();
		System.out.println("Serialization Completed.........");

		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("DeSerialization Started..........");

		FileInputStream fis = new FileInputStream("vansh.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee e1 = (Employee) ois.readObject();
		System.out.println("Deserialization Completed................");
		
		
		fis.close();
		ois.close();
		
	
		
		System.out.println();
		System.out.println(e1.id+" "+e1.name);
		
		
	}

}
