package com.dev.Encapsulation;

public class Pets_Array {
	
	public static void main (String[] args)
	{
		Pets ref1 = new Pets();
		Pets ref2 = new Pets();
		Pets ref3 = new Pets();
		
		Pets ref4 = new Pets();
		Pets ref5 = new Pets();
		Pets ref6 = new Pets();
		
		ref1.setPetName("pehu");
		ref1.setPetAge(1);
		ref1.setPetColour("Green with pink");
		ref1.setPetOwnerName("Surendhrar");
		
		ref2.setPetName("reta");
		ref2.setPetAge(2);
		ref2.setPetColour("purple");
		ref2.setPetOwnerName("Geetha");
		
		ref3.setPetName("raju");
		ref3.setPetAge(3);
		ref3.setPetColour("Golsen & brown");
		ref3.setPetOwnerName("Sunitha");
		
		Pets[] birds= { ref1,ref2,ref3};
		
		for(int i = 0 ; i < birds.length ; i++ )
		{
			System.out.println("Age " + birds[i].getPetAge());
			System.out.println("Name " + birds[i].getPetName());
			System.out.println("Colour " + birds[i].getPetColour());
			System.out.println("Owner" + birds[i].getPetOwnerName());
			System.out.println("---------------------");
		}
		
		ref4.setPetName("giri");
		ref4.setPetAge(3);
		ref4.setPetColour("Golsen & brown");
		ref4.setPetOwnerName("Ramu");
		
		ref5.setPetName("priya");
		ref5.setPetAge(3);
		ref5.setPetColour(" brown");
		ref5.setPetOwnerName("Sunitha");
		
		ref6.setPetName("sura");
		ref6.setPetAge(3);
		ref6.setPetColour("Golden");
		ref6.setPetOwnerName("ramanathan");
		
		Pets[] cats= { ref4,ref5,ref6};
		
		for(int i = 0 ; i < birds.length ; i++ )
		{
			System.out.println("Age " + cats[i].getPetAge());
			System.out.println("Name " + cats[i].getPetName());
			System.out.println("Colour " + cats[i].getPetColour());
			System.out.println("Owner" + cats[i].getPetOwnerName());
			System.out.println("---------------------");
		}
		
		Pets ref7 = new Pets();
		Pets ref8 = new Pets();
		Pets ref9 = new Pets();
		
		ref7.setPetName("sura");
		ref7.setPetAge(3);
		ref7.setPetColour("Golden");
		ref7.setPetOwnerName("ramanathan");
		
		ref8.setPetName("sura");
		ref8.setPetAge(3);
		ref8.setPetColour("Golden");
		ref8.setPetOwnerName("ramanathan");
		
		ref9.setPetName("sura");
		ref9.setPetAge(3);
		ref9.setPetColour("Golden");
		ref9.setPetOwnerName("ramanathan");
		
		Pets[] lion= { ref7,ref8,ref9};
		
		for(int i = 0 ; i < lion.length ; i++ )
		{
			System.out.println("Age " + lion[i].getPetAge());
			System.out.println("Name " + lion[i].getPetName());
			System.out.println("Colour " + lion[i].getPetColour());
			System.out.println("Owner" + lion[i].getPetOwnerName());
			System.out.println("---------------------");
		}
		
		
	}

}
