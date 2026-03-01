package com.mapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Passport {
	private String name;
	private String city;
	private String country;

	public Passport(String name, String city, String country) {
		super();
		this.name = name;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Passport [name=" + name + ", city=" + city + ", country=" + country + "]";
	}

}

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Passport pass1 = new Passport("Shubham Agrawl", "Jaipur", "India");
		Passport pass2 = new Passport("Daksh Saini", "Udaipur", "India");
		Passport pass3 = new Passport("Piyush Kuswaha", "Indore", "India");
		Passport pass4 = new Passport("Vansh Vijayvargiya", "Bhopal", "India");

		Integer id1 = Integer.valueOf(101);
		Integer id2 = Integer.valueOf(102);
		Integer id3 = Integer.valueOf(103);
		Integer id4 = Integer.valueOf(104);

		HashMap<Integer, Passport> hm = new HashMap<Integer, Passport>();

		
		hm.put(id1, pass1);
		hm.put(id2, pass2);
		hm.put(id3, pass3);
		hm.put(id4, pass4);

		System.out.println("Enter Your Passport Number: ");
		Integer userNumber = sc.nextInt();
			
			Set<Entry<Integer,Passport>> entry= 	hm.entrySet();
				boolean flag=false;
			Iterator<Entry<Integer,Passport>> itr = entry.iterator();
			
		while(itr.hasNext()) {		
		Entry<Integer,Passport>	keyValue =itr.next();
				Integer Key=	keyValue.getKey();
				
				if(userNumber.equals(Key)) {
					System.out.println("Please Find Your Passport Details Below: ");
					System.out.println(keyValue.getValue());
					flag=true;
				}
				
				
				
		}
		if(!flag) {
			System.out.println("Unable to fetch Your Information Based on Passport Number: ");
		}

	}
}

