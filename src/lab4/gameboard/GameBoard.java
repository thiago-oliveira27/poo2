package lab4.gameboard;

import java.util.Random;
import java.util.Scanner;

import lab4.builder.objProduct.RPGCharacter;
import lab4.gameboard.images.GameImages;
import lab4.utils.Util;

public class GameBoard { 
	
	private static int PRINT_CONST = 25;

	public static void _game_start_(RPGCharacter character) {	
		Object[][] mapItems = new String[100][100];
		Scanner sc = new Scanner(System.in);
		
		GameBoard.generatingMapItemsAndEnemies(mapItems);
		char option = ' ';
		System.out.println("\nAre you ready? (y/n)");
		option = sc.nextLine().charAt(0);
		
		while(option != 'y' && option != 'n' ) {	
			System.out.println("Press a valid option!");
			option = sc.nextLine().charAt(0);
	}
		
		if(option == 'n') {
			Util.print("Come back when you get ready ...", PRINT_CONST);
			Util.print(GameImages.COMEBACK_READY_MESSAGE, 3);
			System.exit(0);
		}
		Util.clearConsole();
		Util.print(GameImages.MOUNTAIN_IMAGE, 3);
		Util.print("You're in the middle of the map. Move yourself to explore around",PRINT_CONST);
		
		GamePlay.play(character, mapItems);
	}
	
	public static void generatingMapItemsAndEnemies(Object[][] mapItems) {	
		
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
