package lab4.builder.objProduct;

public class RPGCharacter{
	
	private String name;
	private String profession;
	private String equipment;
	private Tribe tribe;
	private float height;
	private String clotheCollor;
	private String hairCollor;
	private float life = 100f;

	public RPGCharacter(String name, String profession, String equipment, Tribe tribe, float height,
			String clotheCollor,String hairCollor, float life) {
		super();
		this.name = name;
		this.profession = profession;
		this.equipment = equipment;
		this.tribe = tribe;
		this.height = height;
		this.clotheCollor = clotheCollor;
		this.hairCollor = hairCollor;
		this.life = life;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setequipment(String equipment) {
		this.equipment = equipment;
	}

	public Tribe getTribe() {
		return tribe;
	}

	public void setTribe(Tribe tribe) {
		this.tribe = tribe;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getClotheCollor() {
		return clotheCollor;
	}
	
	public void setClotheCollor(String clotheCollor) {
		this.clotheCollor = clotheCollor;
	}

	public String getHairCollor() {
		return hairCollor;
	}

	public void setHairCollor(String hairCollor) {
		this.hairCollor = hairCollor;
	}

	public float getLife() {
		return life;
	}

	public void setLife(float life) {
		this.life = life;
	}
	
	public void atack() {
		System.out.println("Atacking...\n The enemy died");
	}
	public void runAway() {
		System.out.println("Running...\nYou ran away");
	}

	@Override
	public String toString() {
		return "\n" + name + " | " + profession + " | Equipment: " + equipment + " | Tribe: "
				+ tribe + " | Height: " + height + " | ClotheCollor: " + clotheCollor + 
				" | Hair Collor: " + hairCollor;
	}
	 
	
}

