package lab4.gameboard;

import java.util.Random;
import java.util.Scanner;

import lab4.builder.director.Director;
import lab4.builder.objProduct.RPGCharacter;
import lab4.gameboard.RANDOM_MAP_STUFF.ItemsEnum;

public class GameBoard { 

	public static void _game_start_(RPGCharacter character) {
		
		Object[][] mapItems = new String[100][100];
		Scanner sc = new Scanner(System.in);
		GameBoard.generatingMapItemsAndEnemies(mapItems);
		char op;
		System.out.println("\nAre you ready? (y/n)");
		op = sc.nextLine().charAt(0);
		
		if(op == 'n') {
			Director.print("Volte quando estiver preparado ...", 50);
			System.exit(0);
		}
		

	}
	
	public static void generatingMapItemsAndEnemies(Object[][] mapItems) {
		
		RANDOM_MAP_STUFF map_stuff = null;
		Random random = new Random();
		
		for(int i = 0;i<100;i++) {
			for(int j = 0;j<100;j++) {	
							
				int ram_item = random.nextInt(ItemsEnum.values().length);
		        ItemsEnum randomEnumItem = ItemsEnum.values()[ram_item];
		        
		        mapItems[i][j] = String.valueOf(randomEnumItem);						
			}
		}
		
	}
	
}
