package lab4.gameboard;

public enum RANDOM_MAP_STUFF {

    //status
	ENEMY(1),
	SECRET_KEY(2),
	LIFE(3),
	MAGIC_PLANT(4);

    private int cod;

	private RANDOM_MAP_STUFF(int cod) {
        this.cod = cod;    
    }

    public int getCod() {
        return cod;
    }


    public static String getStringValue(int value) {
        for (RANDOM_MAP_STUFF color : RANDOM_MAP_STUFF.values()) {
            if (color.getCod() == value) {
                return color.name();
            }
        }
        return null;
    }
    
    public static int size() {
    	int count=0;
    	for(RANDOM_MAP_STUFF x : RANDOM_MAP_STUFF.values()) {
            count++;
        }
    	return count;
    }

}


















/*
 public class RANDOM_MAP_STUFF {	
	enum ItemsEnum {
		ENEMY,
		SECRET_KEY,
		LIFE,
		MAGIC_PLANT;
    }	
} 
 
 */