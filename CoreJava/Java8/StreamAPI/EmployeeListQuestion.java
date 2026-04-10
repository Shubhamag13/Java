package StreammJava8;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListQuestion {
	public static void main(String[] args) {
		
	
	Employee emp1 = new Employee(101,"Vansh",20,"Male","IT",2006,59000);
	Employee emp2 = new Employee(102,"Shubham",22,"Male","CSE",2006,25000);
	Employee emp3 = new Employee(103,"Rohit",21,"Male","CSE",2006,50000);
	Employee emp4 = new Employee(104,"Mohit",23,"Male","AI&DS",2006,65000);
	Employee emp5 = new Employee(105,"Jatin",22,"Male","BCA",2006,70000);
	Employee emp6 = new Employee(106,"Daksh",25,"Male","BCA",2006,20000);
	
	List<Employee> emp = new ArrayList<>();
	
	emp.add(emp1);
	emp.add(emp2);
	emp.add(emp3);
	emp.add(emp4);
	emp.add(emp5);
	emp.add(emp6);
	
	
	System.out.println(emp);
	
	//Filter the data where employeee salary is greater than 50,000
	
	emp.stream().filter(i->i.getSalary()>50000).forEach(i->System.out.println(i));
	
}}
