package lab3.builder.objProduct;

public class RPGCharacter{
	
	private String name;
	private String profession;
	private String equipment;
	private Tribe tribe;
	private float height;
	private String clotheCollor;
	private String hairCollor;
		
	public RPGCharacter(String name, String profession, String equipment, Tribe tribe, float height,
			String clotheCollor, String hairCollor) {
		super();
		this.name = name;
		this.profession = profession;
		this.equipment = equipment;
		this.tribe = tribe;
		this.height = height;
		this.clotheCollor = clotheCollor;
		this.hairCollor = hairCollor;
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

	public String getequipment() {
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

	public void atack() {
		System.out.println("Atacking...\n The enemy died");
	}
	public void runAway() {
		System.out.println("Running...\nYou ran away");
	}

	@Override
	public String toString() {
		return "RPGCharacter [name=" + name + ", profession=" + profession + ", equipment=" + equipment + ", tribe="
				+ tribe + ", height=" + height + ", clotheCollor=" + clotheCollor + ", hairCollor=" + hairCollor + "]";
	}
	 
	
}

