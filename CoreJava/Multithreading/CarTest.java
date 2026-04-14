package com.multithreading;

//Synchronization very very Important, its mean restriction.............
class Car implements Runnable {

	@Override
	public  void run() { // Method level Lock //Method Synchronization

		try {
			System.out.println(Thread.currentThread().getName() + "Has Entered the Parking Lot"); // NAme
			Thread.sleep(3000); // Checked Exception [ Interrupted Exception ]
			
			synchronized(this) {
			System.out.println(Thread.currentThread().getName() + "Got into car to Drive"); // NAme
			Thread.sleep(3000); 
			System.out.println(Thread.currentThread().getName() + "Started to Drive The Drive"); // NAme
			Thread.sleep(3000); 
			System.out.println(Thread.currentThread().getName()+ "Came Back and Parked the Car ");
		} }catch (InterruptedException e) {
			System.out.println("Some Problems ..... ");

		}
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car();

		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);

		t1.setName("SON-1");
		t2.setName("SON-2");
		t3.setName("SON-3");

		t1.start();
		t2.start();
		t3.start();
	}
}
