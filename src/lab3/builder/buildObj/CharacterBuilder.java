package lab3.builder.buildObj;

import lab3.builder.interfac.Builder;
import lab3.builder.objProduct.RPGCharacter;
import lab3.builder.objProduct.Tribe;

public class CharacterBuilder implements Builder{	
	
	private String name;
	private String profession;
	private String equipment;
	private Tribe tribe;
	private float height;
	private String clotheCollor;
	private String hairCollor;
	

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Override
	public void setEquipment(String equipment) {
		this.equipment = equipment;
		
	}

	@Override
	public void setTribe(Tribe tribe) {
		this.tribe = tribe;
		
	}

	@Override
	public void setHeight(float height) {
		this.height = height;
		
	}

	@Override
	public void setClotheCollor(String clotheCollor) {
		this.clotheCollor = clotheCollor;
		
	}

	@Override
	public void setHairCollor(String hairCollor) {
		this.hairCollor = hairCollor;
		
	}
	
	public RPGCharacter getResult() {
        return new RPGCharacter(name, profession, equipment, tribe, height, clotheCollor, hairCollor);
    }

				 
}
