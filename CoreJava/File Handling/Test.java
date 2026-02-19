package com.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
public static void main(String[] args) throws IOException {
	
	//File class 
	//file creating
//	File file = new File("JavaA2.txt");
//	file.createNewFile(); //--> use to create a new file 
//	
//	System.out.println("file is created");
//	
	
	//folder creating
//	File file1 =new File("JavaA222"); 
//	file1.mkdirs(); //--> use to create a new folder 
	
	
	//FileWriter class -->use to write the data in file
	/*
	FileWriter filewriter = new FileWriter("JavaA22/hello22.txt");
	
	filewriter.write("Hello Vansh");
	
	filewriter.close();
	
	System.out.println("Done");
	
	*/
	
	
	
	//FileReader --> use to read the data from the file 
	/* 
	FileReader filereader = new FileReader("JavaA22/hello22.txt");
	
	int i = filereader.read();
	
	while(i!=-1) {
		System.out.println((char)i);
		i=filereader.read();
	}
	*/
	
	//BufferedReader --> Read the input from the file 
	
	FileReader filereader = new FileReader("JavaA22/hello22.txt");
	
	BufferedReader br = new BufferedReader(filereader);
	
	String statement = br.readLine();
	
	System.out.println(statement);
	
}





}
