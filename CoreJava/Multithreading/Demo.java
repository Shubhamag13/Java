package com.multithreading;


//Create using implement Runnable function interface that contain only single abstract method i.e. run()
class MyThread implements Runnable{
	@Override
	public void run(){
		System.out.println("With Runnable Interface : Current Thread :: "+Thread.currentThread());
	}
}


//Create using extends thread class
class MyThread2 extends Thread{
	@Override
	public void run() {
		System.out.println("With Extends Thread: Current Thread :: "+Thread.currentThread());
	}
}

public class Demo {
public static void main(String[] args) {
	
	System.out.println(Thread.currentThread());
	MyThread2 mt2 = new MyThread2();
	Thread t1 = new Thread(mt2);
	mt2.run();
	t1.start();
	
	
	
	MyThread mt1 = new MyThread();
	 Thread t2 = new Thread(mt1);
	 t2.start();
	
	
	
	
}
}
