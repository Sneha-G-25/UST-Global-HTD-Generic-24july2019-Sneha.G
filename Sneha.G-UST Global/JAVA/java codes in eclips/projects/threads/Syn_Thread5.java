package com.dev.threads;

//Syn_Thraed4,Printer

public class Syn_Thread5 extends Thread{

	Printer p;
	public Syn_Thread5(Printer pref) {
		p = pref;
	}
	
	@Override
	public void run() {
		
		p.printVal(10,"Thraed 5");
		}
		
	}

