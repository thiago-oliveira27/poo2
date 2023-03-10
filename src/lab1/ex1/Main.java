package lab1.ex1;

public class Main {
	public static void main(String[] args) {
		Thread t = new Thread(new LineCounter());
		t.start();
	}
	
}
