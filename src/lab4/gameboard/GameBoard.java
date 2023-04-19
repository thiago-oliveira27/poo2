package lab4.gameboard;

import java.util.Random;
import java.util.Scanner;

import lab4.builder.objProduct.RPGCharacter;
import lab4.utils.Print;

public class GameBoard { 
	
	private static int PRINT_CONST = 25;

	public static void _game_start_(RPGCharacter character) {	
		Object[][] mapItems = new String[100][100];
		Scanner sc = new Scanner(System.in);
		
		GameBoard.generatingMapItemsAndEnemies(mapItems);
		char op;
		System.out.println("\nAre you ready? (y/n)");
		op = sc.nextLine().charAt(0);
		
		if(op == 'n') {
			Print.print("Come back when you get ready ...", 50);
			System.exit(0);
		}
		
		Print.print("You're in the middle of the map. Move yourself to explore around",PRINT_CONST);
		GamePlay.play(character, mapItems);
	}
	
	public static void generatingMapItemsAndEnemies(Object[][] mapItems) {	
		RANDOM_MAP_STUFF map_stuff = null;
		Random random = new Random();
		
		for(int i = 0;i<100;i++) {
			for(int j = 0;j<100;j++) {	
										
				int ram_item_number = random.nextInt(RANDOM_MAP_STUFF.size());
				
				if(ram_item_number == 0) {
					ram_item_number++;
				}
				
				mapItems[i][j] = RANDOM_MAP_STUFF.getStringValue(ram_item_number);									
			}
		}		
	}
}
