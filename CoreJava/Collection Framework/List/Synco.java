//Vector is  Synchronized
package com.Listss;

import java.util.Vector;

class VThread1 extends Thread {
	Vector<Integer> v;

	public VThread1(Vector<Integer> v) {
		this.v = v;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			v.add(i);
		}
	}
}

class VThread2 extends Thread {
	Vector<Integer> v;

	public VThread2(Vector<Integer> v) {
		this.v = v;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			v.add(i);
		}
	}
}
public class Synco {
public static void main(String[] args) throws InterruptedException {
	Vector<Integer > v = new Vector<Integer>();
	VThread1 t1 = new VThread1(v);
	VThread2 t2 = new VThread2(v);
	
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	System.out.println("Vector Size: "+v.size());
}
}
