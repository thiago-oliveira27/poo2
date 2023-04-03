package lab4.builder.interfac;

import lab4.builder.objProduct.Tribe;

public interface Builder {
	
	void setName(String name);
	void setProfession(String profession);
	void setEquipment(String equipment);
	void setTribe(Tribe tribe);
	void setHeight(float height);
	void setClotheCollor(String clotheCollor);
	void setHairCollor(String hairCollor);

}
