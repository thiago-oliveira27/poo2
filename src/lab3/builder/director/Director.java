package lab3.builder.director;

import java.util.Locale;
import java.util.Scanner;

import lab3.builder.interfac.Builder;
import lab3.builder.objProduct.RPGCharacter;
import lab3.builder.objProduct.Tribe;

public class Director {

	public void constructCharacter(Builder builder) {
		
		Locale.setDefault(Locale.US);
		Scanner rd = new Scanner(System.in);
		
		String name;
		int tribe = 0;
		
		print("Welcome to the game", 25); 
		
		print("Lets get started by creating your character", 25);
		System.out.print("Loading "); 
		charging(10);

		print("\n\nType the character name: ", 25);
		builder.setName(name = rd.nextLine());		

		print("\nType the profession: ", 25);
		builder.setProfession(rd.nextLine());

		print("\nType the equipament you're going to use: ", 25);
		builder.setEquipment(rd.nextLine());
		
		print("\nType the tribe you belong: "
				 + "1 - FIRE, 2 - WATER, 3 - EARTH, 4 - AIR", 25);
		tribe = rd.nextInt();
		
			switch (tribe) {
				case 1:
					builder.setTribe(Tribe.FIRE);
					break;
				case 2:
					builder.setTribe(Tribe.WATER);
					break;
				case 3:
					builder.setTribe(Tribe.EARTH);
					break;
				case 4:
					builder.setTribe(Tribe.AIR);
					break;
			}
		
		print("\nType your height: ", 25);
		builder.setHeight(rd.nextFloat());
		rd.nextLine();
		print("\nType the clothe collor: ", 25);
		builder.setClotheCollor(rd.nextLine());
		
		print("\nType the hair collor: ", 25);
		builder.setHairCollor(rd.nextLine());
		
		print("Great " + name +"! We're almost done creating your character", 25);
		charging(5);
		System.out.print("\nGenerating map");
		charging(5);
		System.out.print("\nSharping the equipment");
		charging(5);
		System.out.print("\nReviewing character atributes:");
			
	}
	
	public static void charging(int n) {	
		for(int i=0;i<n;i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	 
	public static void print(String txt, int sleep) {
		
		String[] text = txt.split("");
		int textSize = text.length;
		
		for(int i=0;i<textSize;i++) {
			System.out.print(text[i]);
			
			try {
				Thread.sleep(sleep);
			} catch(InterruptedException e){e.printStackTrace();}
		}
		System.out.println();
	}
}
