package StreammJava8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMethodExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 6, 6, 5, 4, 8, 9, 6, 7, 4, 0, 1, 10);

		// MethodChaining

		// Sort Using StreamApi
		list.stream().sorted().forEach(i -> System.out.print(i + " "));
		System.out.println();

		// Transform Data using StreamApi
		list.stream().map(i -> i * i).forEach(i -> System.out.print(i + " "));
		System.out.println();

		// Filter then sort then print
		list.stream().filter(i -> i % 2 == 0).sorted().forEach(i -> System.out.print(i + " "));
		System.out.println();
		// Distinct --> print the unique element from the list
		list.stream().distinct().forEach(i -> System.out.print(i + " "));
		System.out.println();

		// Limit --> Limit → take only the first 5 elements from the list

		list.stream().limit(5).forEach(i -> System.out.print(i + " "));

		System.out.println();

		// Skip --> Ignore the fist 5 element and print the rest
		list.stream().skip(5).forEach(i -> System.out.print(i + " "));

		System.out.println();
		// Convet the list into set
		Set<Integer> setData = list.stream().collect(Collectors.toSet());
		setData.forEach(i -> System.out.print(i + " "));
	}
}
