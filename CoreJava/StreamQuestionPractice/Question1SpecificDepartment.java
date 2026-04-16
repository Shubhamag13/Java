package com.streamQuestion;

import java.util.ArrayList;
import java.util.List;

public class Question1SpecificDepartment {
public static void main(String[] args) {
	Employee emp1 = new Employee(101,"Vansh", "IT",20000 );
	Employee emp2 = new Employee(102,"Shubham",  "CSE",30000 );
	Employee emp3 = new Employee(103,"Rohit",  "CSE",40000 );
	Employee emp4 = new Employee(104,"Aman",  "AI",50000 );
	Employee emp5 = new Employee(105,"Daksh",  "AI",75000 );
	Employee emp6 = new Employee(106,"Piyush", "IT",28000 );
	
	
	List<Employee> empp= new ArrayList<>();
	empp.add(emp1);
	empp.add(emp2);
	empp.add(emp3);
	empp.add(emp4);
	empp.add(emp5);
	empp.add(emp6);
	
	
	empp.stream().filter(i->i.getDepartment()=="IT").forEach(i->System.out.println(i));
}
}
