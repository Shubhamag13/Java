package com.multithreading;


// Method Level Lock [Method Synchronization]
// Block Level Synchronization [Synchronized Block]

class Student implements Runnable{
	
	@Override
	public synchronized void run() {
		
		try {
			System.out.println(Thread.currentThread().getName() + "class room se bahar gaye"); // NAme
			Thread.sleep(3000); // Checked Exception [ Interrupted Exception ]
			System.out.println(Thread.currentThread().getName() + "notice board wale area me enter hua"); // NAme
			Thread.sleep(3000); 
			System.out.println(Thread.currentThread().getName() + "notice board par jo notice likha hua tha usko padha"); // NAme
			Thread.sleep(3000); 
			System.out.println(Thread.currentThread().getName()+ "Notice Padhne ke badd institute se bahar nika gaye ");
			
			
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
	}
}


public class StudentTest {
	public static void main(String[] args) {
		
	
	Student s = new Student();
	Thread t1 = new Thread(s);
	Thread t2 = new Thread(s);
	Thread t3 = new Thread(s);
	
	t1.setName("Student-1");
	t2.setName("Student-2");
	t3.setName("Student-3");
	
	
	t1.start();
	t2.start();
	t3.start();
	
	
	}
}
