package lab4.gameboard;

import java.util.Random;
import java.util.Scanner;

import lab4.builder.objProduct.RPGCharacter;
import lab4.gameboard.messages.GameMessages;
import lab4.utils.Print;

public class GamePlay {

	private static int PRINT_CONST = 25;
	private static int SECRET_KEYS_COUNT = 0;
	private static int ENEMY_KILLED_COUNT = 0;
	private static float player_life;

	public static void play(RPGCharacter character, Object[][] map) {
		
		player_life = character.getLife();

		char moveChoosed = ' ';
		
		Print.print("Press (w) to move foward", PRINT_CONST);
		Print.print("Press (a) to move to the left", PRINT_CONST);
		Print.print("Press (s) to move backward", PRINT_CONST);
		Print.print("Press (d) to move to the right", PRINT_CONST);
		
		Scanner sc = new Scanner(System.in);
		moveChoosed = sc.nextLine().charAt(0);
		
		while(!verifyValidMovement(moveChoosed)) {
			System.out.println("Press a valid option!");
			moveChoosed = sc.nextLine().charAt(0);
		}
		
		showMapContent(map, moveChoosed);
		Print.print("Keep walking... press (w,a,s,d)", PRINT_CONST);
		
		do {
			while(!verifyValidMovement(moveChoosed)) {
				System.out.println("Press a valid option!");
				moveChoosed = sc.nextLine().charAt(0);
			}
			showMapContent(map, moveChoosed);
			Print.print("Keep walking...", PRINT_CONST);
		} while (Boolean.TRUE);
		
	}

	public static int movePlayer(char x) {
		
		switch (x) {
		case 'w':
			Print.print("Moving foward...", PRINT_CONST);
			return 0;
		case 'a':
			Print.print("Moving to the left...", PRINT_CONST);
			return 0;
		case 's':
			Print.print("Moving to the right...", PRINT_CONST);
			return 0;
		case 'd':
			Print.print("Moving backwards...", PRINT_CONST);
			return 0;	
		default:
			return 0;
		}	
	}
	
	public static void showMapContent(Object[][] map, char moveChoosed) {
		
		int x,y;
		Random random = new Random();	
		x = random.nextInt(100);
		y = random.nextInt(100);
		
		if (movePlayer(moveChoosed)==0) {
			
			switch (verifyMapBlockContent(map, x, y)) {			
			case 1:
				Print.print(GameMessages.FIGHT_MESSAGE,PRINT_CONST);
				battle();
				break;
			case 2:
				Print.print(GameMessages.KEY_MESSAGE,PRINT_CONST);
				checkSecretKeyNumber();
				break;
			case 3:
				Print.print(GameMessages.LIFE_MESSAGE,PRINT_CONST);
				bonusLife();
				break;
			case 4:
				Print.print(GameMessages.PLANT_MESSAGE, PRINT_CONST);				
				break;
			default:
				break;
			}	
		}	
	}

	public static int verifyMapBlockContent(Object[][] mapItems, int x, int y) {
		
		if(mapItems[x][y].equals(RANDOM_MAP_STUFF.ENEMY.toString())) {
			return 1;
		}else if(mapItems[x][y].equals(RANDOM_MAP_STUFF.SECRET_KEY.toString())) {
			return 2;
		}else if(mapItems[x][y].equals(RANDOM_MAP_STUFF.LIFE.toString())) {
			return 3;
		}else if(mapItems[x][y].equals(RANDOM_MAP_STUFF.MAGIC_PLANT.toString())) {
			return 4;
		} 
		return 0;

	}
	
	public static boolean verifyValidMovement(char move){	
		if (move == 'w'
				|| move == 'a'
				|| move == 's'
				|| move == 'd') {
			return true;		
		}	
		return false;
	}
	public static void battle() {

		Random random = new Random();	
		 int damageCaused;
		 int enemyRemainingLife;
		 int damageSuffered;
		 int enemyLife = 100;
		 char option = ' ';
		 int kills_remaining = 3 - ENEMY_KILLED_COUNT;


		Print.print("Press (a) to atack the enemy", PRINT_CONST);
		Scanner sc = new Scanner(System.in);
		option = sc.nextLine().charAt(0);

		while(option != 'a') {	
				System.out.println("Press a valid option!");
				option = sc.nextLine().charAt(0);
		}

		damageCaused = random.nextInt(100);

		if(damageCaused == 100.0){
			Print.print("You killed him!", PRINT_CONST);
			checkRemainingKills();
		} else {
			enemyRemainingLife = enemyLife - damageCaused;
			Print.print("You caused " + damageCaused + "of damage",PRINT_CONST);
			checkRemainingKills();

		}
	}

	public static void checkRemainingKills() {
		int kills_remaining = 3 - ENEMY_KILLED_COUNT;
		if(ENEMY_KILLED_COUNT < 3){
			ENEMY_KILLED_COUNT++;
			Print.print("Only " + kills_remaining + "keys remaining. Keep going fella!", PRINT_CONST);
		} else {
			Print.print("You just killed the last enemy, congrats! WINNER", PRINT_CONST);
			System.exit(0);
		}
	}

	public static void checkSecretKeyNumber() {
		int keys_remaining = 3 - SECRET_KEYS_COUNT;
		if(SECRET_KEYS_COUNT < 3){
			SECRET_KEYS_COUNT++;
			Print.print("Only " + keys_remaining + "keys remaining. Keep going fella!", PRINT_CONST);
		} else {
			Print.print("You just found the last key! WINNER", PRINT_CONST);
			System.exit(0);
		}
	}

	public static void bonusLife(){
		player_life += ((25*player_life)/100);
	}
}
