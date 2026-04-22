package com.streamQuestion;

public class Transaction {

	int amount;
	String date;
	
	Transaction(int amount,String date){
		this.amount=amount;
		this.date=date;
	}

	@Override
	public String toString() {
		return "Transaction [amount=" + amount + ", date=" + date + "]";
	}
	
	public int getamount() {
		return amount;
		
	}
	public void setamount(int amount) {
		this.amount=amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
