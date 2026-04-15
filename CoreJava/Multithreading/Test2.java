package com.multithreading;

class SomeTask{
	public  synchronized static  void printStackTrace(int n) {
		
		for(int i=1;i<=n;i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}

class AThread extends Thread{
	@Override
	public void run() {
		SomeTask.printStackTrace(10);
	}
}

class BThread extends Thread{
	@Override
	public void run() {
		SomeTask.printStackTrace(20);
		}
}


public class Test2 {
public static void main(String[] args) {
	AThread mt2 = new AThread();
	Thread t1 = new Thread(mt2);
	t1.start();
	
	BThread mt = new BThread();
	Thread t = new Thread(mt);
	t.start();
	
}
}
