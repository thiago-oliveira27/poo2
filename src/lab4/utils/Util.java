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
	        if (System.getProperty("os.name").contains("Windows")) {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } else {
	            System.out.print("\033[H\033[2J");
	            System.out.flush();
	        }
	    } catch (Exception ex) {
	        // handle exception
	    }
	}

}
