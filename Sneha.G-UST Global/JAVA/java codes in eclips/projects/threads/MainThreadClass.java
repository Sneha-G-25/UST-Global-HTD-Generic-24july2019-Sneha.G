package com.dev.threads;

public class MainThreadClass {

	public static void main(String[] args) {
		System.out.println("Main thraed starts with i value....");

		Thread2 ref = new Thread2();
		ref.setName("Thread Thread2");
		ref.setPriority(1);
		ref.start();


		//new T2().run(); // it is used to start the thread t2

		Thread3 ref1 = new Thread3();
		Thread t = new Thread(ref1);
		t.setPriority(2);
		t.start();

		Thread.currentThread().setName("Main Thread");// setting the name to main thread
		//new Thread(new T3()).start();		// diffrent ways to statrt the the 
		//new T3().run();

		for(int i = 0; i<=10; i++) {
			System.out.println("i = "+ i);
		}

		System.out.println("Main thread ends....");
		System.out.println("this is thread 2 name :"+ ref.getName());
		System.out.println("Thread2 id:"+ ref.getId());
		System.out.println("Thread3 id: "+ t.getId());
		System.out.println("Priority of 2nd thread is"+ref.getPriority());
		System.out.println("Priority of 3rd thread is"+t.getPriority());
		System.out.println("main thread name is :"+ Thread.currentThread().getName());

	}

}
