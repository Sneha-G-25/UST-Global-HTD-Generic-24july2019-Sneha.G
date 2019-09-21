package com.dev.threads;

//Syn_Thraed4,Printer,SynacMainThread,Syn_Thraed5

public class SynacMainThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(" SynacMain Thread started....");

		
		Printer p = new Printer();

		Syn_Thread4 t4 = new Syn_Thread4(p);
		t4.start();
		// t4.join(); // used to get data in syncronized form
		Syn_Thread5 t5 = new Syn_Thread5(p);
		t5.join(); // join makes sure that before next thread statrts it complets the execution
		t5.start();

//		new Syn_Thread4(p).start();
//		new Syn_Thread5(p).start();
//		

		System.out.println(" SynacMain Thread ends....");
	}

}
