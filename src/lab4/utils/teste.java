package lab4.utils;

import java.util.Random;

public class teste {
	public static void main(String[]args) {
		Random random = new Random();
		float damageSuffered = (float) random.nextInt(5);
		
		System.out.println(damageSuffered);
		
	}
}
