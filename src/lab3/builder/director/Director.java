package lab3.builder.director;

import lab3.builder.interfac.Builder;
import lab3.builder.objProduct.RPGCharacter;
import lab3.builder.objProduct.RPGCharacterModel;

public class Director {

	public void constructCharacter(Builder builder, RPGCharacterModel model) {		
		builder.setName(model.getName());
		builder.setProfession(model.getProfession());
		builder.setEquipment(model.getEquipment());
		builder.setTribe(model.getTribe());
		builder.setHeight(model.getHeight());
		builder.setClotheCollor(model.getClotheCollor());
		builder.setHairCollor(model.getHairCollor());
	
	}
	

}
