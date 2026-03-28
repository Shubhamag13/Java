package StreammJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ExampleConsumer {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(50);
		list.add(40);
		list.add(20);
		list.add(47);
		list.add(45);

		/*
		 * Consumer<Object> consumer = new Consumer<Object>() {
		 * 
		 * @Override public void accept(Object t) { System.out.println(t); } };
		 */

//	Consumer<Integer> consumer = t -> System.out.println(t);
//	list.forEach(consumer);
		/*
		 * System.out.println("Sort the list using Collections Class");
		 * Collections.sort(list); System.out.println(list);
		 */

		// Sort the list using Stream API(sort the data without changing the existing
		// collections)

		Stream<Integer> sorted = list.stream().sorted();
		sorted.forEach(i -> System.out.println(i));
		System.out.println(list);
		
	Stream<Integer> map =list.stream().map(i->i*i);
	map.forEach(i->System.out.println(i));
	}
}
