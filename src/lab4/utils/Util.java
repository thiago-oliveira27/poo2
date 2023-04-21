package lab4.utils;

public abstract class Util {

	public static void print(String txt, int sleep) {
			
			String[] text = txt.split("");
			int textSize = text.length;
			
			for(int i=0;i<textSize;i++) {
				System.out.print(text[i]);
				
				try {
					Thread.sleep(sleep);
				} catch(InterruptedException e){e.printStackTrace();}
			}
			System.out.println();
		}	
	
	public static void clearConsole() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i =0; i<7;i++) {
			System.out.println();
		}    
	}
	
	public static void gameFinish() {
		System.exit(0);
	}
	
}
