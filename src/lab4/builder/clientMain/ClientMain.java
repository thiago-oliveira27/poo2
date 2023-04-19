package lab4.builder.clientMain;

import lab4.builder.buildObj.CharacterBuilder;
import lab4.builder.director.Director;
import lab4.builder.objProduct.RPGCharacter;
import lab4.gameboard.GameBoard;

public class ClientMain {

	public static void main(String[] args) throws InterruptedException {
		
		Director director = new Director(); // The one who knows how to build
		CharacterBuilder builder = new CharacterBuilder(); // The one who knows what to build
			
		director.constructCharacter(builder);	
		RPGCharacter myCharacter = builder.getResult();
		System.out.println(myCharacter);
		
		GameBoard._game_start_(myCharacter);
		
	
	
	}

	
	
}
	
