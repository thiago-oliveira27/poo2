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
		final int PRINT_CONST = 4;
		
		String name;
		int tribe = 0;
		
		Util.print("Welcome to the game", PRINT_CONST); 
		
		Util.print("Lets get started by creating your character", PRINT_CONST);
		System.out.print("Loading "); 

		Util.print("\n\nType the character name: ", PRINT_CONST);
		builder.setName(name = rd.nextLine());		

		Util.print("\nType the profession: ", PRINT_CONST);
		builder.setProfession(rd.nextLine());

		Util.print("\nType the equipament you're going to use: ", PRINT_CONST);
		builder.setEquipment(rd.nextLine());
		
		Util.print("\nType the tribe you belong: "
				 + "1 - FIRE, 2 - WATER, 3 - EARTH, 4 - AIR", PRINT_CONST);
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
		
		Util.print("\nType your height: ", PRINT_CONST);
		builder.setHeight(rd.nextFloat());
		rd.nextLine();
		Util.print("\nType the clothe collor: ", PRINT_CONST);
		builder.setClotheCollor(rd.nextLine());
		
		Util.print("\nType the hair collor: ", PRINT_CONST);
		builder.setHairCollor(rd.nextLine());
		
		Util.print("\nGreat " + name +"! We're almost done creating your character", PRINT_CONST);
		Util.print("\nGenerating map", PRINT_CONST);
		Util.print("\nSharping the equipment", PRINT_CONST);
		Util.print("\nReviewing character atributes:", PRINT_CONST);
		
	}	
}
