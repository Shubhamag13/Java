//ArrayList is NOt Synchronized
package com.Listss;

import java.util.ArrayList;

class MyThread1 extends Thread {
	ArrayList<Integer> al;

	public MyThread1(ArrayList<Integer> al) {
		this.al = al;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			al.add(i);
		}
	}
}

class MyThread2 extends Thread {
	ArrayList<Integer> al;

	public MyThread2(ArrayList<Integer> al) {
		this.al = al;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			al.add(i);
		}
	}
}
public class NotSynco {
public static void main(String[] args) throws InterruptedException {
	ArrayList<Integer > al = new ArrayList<Integer>();
	MyThread1 t1 = new MyThread1(al);
	MyThread2 t2 = new MyThread2(al);
	
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	System.out.println("ArrayList Size: "+al.size());
}
}
