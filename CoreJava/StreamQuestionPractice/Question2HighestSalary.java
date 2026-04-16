package com.streamQuestion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Question2HighestSalary {
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
		
//	Optional<Employee> emp = empp.stream().max((o1,o2)->o1.getSalary()-o2.getSalary());
//	Optional<Employee> empp1 = empp.stream().max(Comparator.comparing(Employee::getSalary));
	
//	System.out.println(emp);
	
	Optional<Employee> op =empp.stream().sorted((o1,o2) -> o2.getSalary() - o1.getSalary()).findFirst();
		
	System.out.println(op);

}
}
