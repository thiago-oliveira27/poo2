package lab4.builder.director;

import java.util.Locale;
import java.util.Scanner;

import lab4.builder.interfac.Builder;
import lab4.builder.objProduct.Tribe;
import lab4.utils.Util;

public class Director {

	public void constructCharacter(Builder builder) {
		
		Locale.setDefault(Locale.US);
		Scanner rd = new Scanner(System.in);
		final int FINAL_PRINT = 4;
		
		String name;
		int tribe = 0;
		
		Util.print("Welcome to the game", FINAL_PRINT); 
		
		Util.print("Lets get started by creating your character", FINAL_PRINT);
		System.out.print("Loading "); 
		charging(10);

		Util.print("\n\nType the character name: ", FINAL_PRINT);
		builder.setName(name = rd.nextLine());		

		Util.print("\nType the profession: ", FINAL_PRINT);
		builder.setProfession(rd.nextLine());

		Util.print("\nType the equipament you're going to use: ", FINAL_PRINT);
		builder.setEquipment(rd.nextLine());
		
		Util.print("\nType the tribe you belong: "
				 + "1 - FIRE, 2 - WATER, 3 - EARTH, 4 - AIR", FINAL_PRINT);
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
		
		Util.print("\nType your height: ", FINAL_PRINT);
		builder.setHeight(rd.nextFloat());
		rd.nextLine();
		Util.print("\nType the clothe collor: ", FINAL_PRINT);
		builder.setClotheCollor(rd.nextLine());
		
		Util.print("\nType the hair collor: ", FINAL_PRINT);
		builder.setHairCollor(rd.nextLine());
		
		Util.print("Great " + name +"! We're almost done creating your character", FINAL_PRINT);
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
}
