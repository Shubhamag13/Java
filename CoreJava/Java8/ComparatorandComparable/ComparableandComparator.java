package StreammJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


//class MyCustomeDog implements Comparator<Animal>{
//
//	@Override
//	public int compare(Animal o1, Animal o2) {
//		
//		return Integer.compare(o1.weight, o2.weight);
//	}
//	
//}

public class ComparableAndComparator {
	public static void main(String[] args) {
		
	
	Animal a1 = new Animal(4,"Cat",55);
	Animal a2 = new Animal(6,"Lion",95);
	Animal a3 = new Animal(2,"Tiger",85);
	Animal a4 = new Animal(2,"Dog",25);
	
	List<Animal> l = new ArrayList<>();
	
	l.add(a4);
	l.add(a3);
	l.add(a2);
	l.add(a1);
	
	
	System.out.println(l);
	
//	Collections.sort(l,new MyCustomeDog());
	
//	l.sort((a,b)->b.age-a.age);
	
	Collections.sort(l,Comparator.comparing(Animal::getAge).thenComparing(Animal::getName));
	
System.out.println(l);
	
	
}
}
