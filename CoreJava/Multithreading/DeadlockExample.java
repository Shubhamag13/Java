package com.multithreading;

class Library implements Runnable {

	String res1 = new String("JAVA");
	String res2 = new String("SQL");
	String res3 = new String("DSA");

	@Override
	public void run() {

		String name = Thread.currentThread().getName();

		if (name.equalsIgnoreCase("STUDENT-01")) {

			try {
				Thread.sleep(3000);

				synchronized (res1) {
					System.out.println("Res1 acquired by student 01" + res1);
					Thread.sleep(3000);
				}
				synchronized (res2) {
					System.out.println("Res2 acquired by student 01" + res2);
					Thread.sleep(3000);
				}

				synchronized (res3) {
					System.out.println("Res3 acquired by student 01" + res3);
					Thread.sleep(3000);
				}

			} catch (InterruptedException e) {
				System.out.println("Some Problem....");
			}

		}
		else {

			try {
				Thread.sleep(3000);

				synchronized (res1) {
					System.out.println("Res3 acquired by student 02" + res3);
					Thread.sleep(3000);
				}
				synchronized (res2) {
					System.out.println("Res2 acquired by student 02" + res2);
					Thread.sleep(3000);
				}

				synchronized (res3) {
					System.out.println("Res1 acquired by student 02" + res1);
					Thread.sleep(3000);
				}

			} catch (InterruptedException e) {
				System.out.println("Some Problem....");
			}

		}

	}
}
	public class DeadLockExample {
		public static void main(String[] args) {
			Library lib = new Library();

			Thread t1 = new Thread(lib);
			Thread t2 = new Thread(lib);

			t1.setName("Student-01");
			t2.setName("Student-02");
			
			t1.start();
			t2.start();

		}

	}
