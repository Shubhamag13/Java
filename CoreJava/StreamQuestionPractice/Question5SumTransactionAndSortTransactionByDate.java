package com.streamQuestion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question5SumTransactionAndSortTransactionByDate {

	public static void main(String[] args) {
		Transaction t1 = new Transaction(2000,"12-July-2025");
		Transaction t2 = new Transaction(1800,"13-June-2025");
		Transaction t3 = new Transaction(100,"13-Dec-2025");
		Transaction t4 = new Transaction(2900,"15-April-2025");
		Transaction t5 = new Transaction(2800,"15-May-2025");
		
		
		List<Transaction> list = new ArrayList<>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		
	int totalamount=	list.stream().mapToInt(i->i.getamount()).sum();
		
	System.out.println("Total Transaction Amount: "+ totalamount);
	
			
List<Transaction> sorted =	list.stream().sorted(Comparator.comparing(Transaction::getDate)).collect(Collectors.toList());
	
System.out.println(sorted);
		
		
	}
	
}
