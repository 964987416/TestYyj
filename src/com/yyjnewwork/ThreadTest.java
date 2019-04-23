package com.yyjnewwork;

public class ThreadTest extends Thread {

	static class MyThread extends Thread {

		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + "" + i);
			}
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i == 3) {
				Thread t1 = new MyThread();
				Thread t2 = new MyThread();
				t1.start();
				t2.start();
			}
		}

	}

}
