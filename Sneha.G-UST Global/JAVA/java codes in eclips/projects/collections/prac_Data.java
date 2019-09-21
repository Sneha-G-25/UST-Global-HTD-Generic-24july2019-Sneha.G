package com.dev.collections;

public class prac_Data extends Practical_Assesment {

	public static void main(String[] args) {
		
		prac_impli dii = new prac_impli();
		
		prac_Data d1 = new prac_Data();
		prac_Data d2 = new prac_Data();
		
		d1.setName("djdj");
		d1.setColor("Black");
		d1.setPlace("Hydrabadh");
		d1.setRange(234);
		
		d2.setName("dinga");
		d2.setColor("Brown");
		d2.setPlace("gurgaw");
		d2.setRange(34);
		
		d1.setPlace("Mysore");

		boolean b = dii.putdata("1",d1);
		System.out.println(b);
		dii.putdata("2",d2);
		
		dii.removeData("1");
		int v1 = d1.getRange();
		int v2 = d2.getRange();
		int sum = (v1+v2)/2;
		System.out.println(sum);
		
		Practical_Assesment  ref = dii.getData("1");
		System.out.println(ref);
		
		
		
		
		
	}

}
