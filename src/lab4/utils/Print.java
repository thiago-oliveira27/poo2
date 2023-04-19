package lab4.utils;

public abstract class Print {

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
}
