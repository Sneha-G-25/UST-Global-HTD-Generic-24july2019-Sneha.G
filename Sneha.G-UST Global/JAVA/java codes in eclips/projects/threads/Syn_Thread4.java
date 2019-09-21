package com.dev.threads;

//Syn_Thraed4,Printer

public class Syn_Thread4 extends Thread{

	Printer p;
	public Syn_Thread4(Printer pref) {
		p = pref;
	}

	@Override
	public void run() {

		try {
			Thread.currentThread().sleep(500);// delays by 500 mili sec
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		p.printVal(10,"Thraed 4");
	}

}

