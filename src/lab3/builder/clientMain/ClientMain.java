package lab3.builder.clientMain;

import java.util.Locale;
import java.util.Scanner;

import lab3.builder.buildObj.CharacterBuilder;
import lab3.builder.director.Director;
import lab3.builder.objProduct.RPGCharacter;
import lab3.builder.objProduct.RPGCharacterModel;
import lab3.builder.objProduct.Tribe;

public class ClientMain {

	public static void main(String[] args) throws InterruptedException {
		
		Director director = new Director(); // The one who knows how to build
		CharacterBuilder builder = new CharacterBuilder(); // The one who knows what to build
		
		
		RPGCharacterModel myCharacter = menu(new RPGCharacterModel());
		System.out.println(myCharacter.getName());
		
		director.constructCharacter(builder, myCharacter);
		
		System.out.println("Character infos:\n"+myCharacter);


	}
	
	public static RPGCharacterModel menu(RPGCharacterModel model) throws InterruptedException {
		
		Locale.setDefault(Locale.US);
		Scanner rd = new Scanner(System.in);
		
		int tribe = 0;
		System.out.println("Welcome to the game");
		System.out.println("Lets get started by creating your character");
		System.out.print("Loading ");
		
		charging(10);

		System.out.println("\n\nType the character name: ");
		model.setName(rd.nextLine());
		//cleanBuff(rd);
		
		System.out.println("\nType the profession: ");
		model.setProfession(rd.nextLine());
		//cleanBuff(rd);
		
		System.out.println("\nType the equipament you're going to use: ");
		model.setEquipment(rd.nextLine());
		//cleanBuff(rd);
		
		System.out.println("\nType the tribe you belong: "
						 + "1 - FIRE, 2 - WATER, 3 - EARTH, 4 - AIR");
		
		tribe = rd.nextInt();
			
				switch (tribe) {
					case 1:
						model.setTribe(Tribe.FIRE);
						break;
					case 2:
						model.setTribe(Tribe.WATER);
						break;
					case 3:
						model.setTribe(Tribe.EARTH);
						break;
					case 4:
						model.setTribe(Tribe.AIR);
						break;
				}		
				
		System.out.println("\nType your height: ");
		model.setHeight(rd.nextFloat());

		
		System.out.println("\nType the clothe collor: ");
		model.setClotheCollor(rd.nextLine());
		cleanBuff(rd);
		
		System.out.println("\nType the hair collor: ");
		model.setHairCollor(rd.nextLine());
		cleanBuff(rd);
		
		System.out.println("Great " + model.getName()+"! Youre done creating the character");
		System.out.print("Generating map");
		charging(5);
		System.out.print("\nSharping the equipment");
		charging(5);
		//cleanBuff(rd);
		
		return model;
	}
	
	public static void charging(int n) {
		
		//String[] teste = "Welcome to the game".split("");
		for(int i=0;i<n;i++) {
			//System.out.print(teste[i]);
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void cleanBuff(Scanner rd){
		rd.next();
	}
	
}
