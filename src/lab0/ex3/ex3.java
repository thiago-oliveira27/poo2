package lab0.ex3;

import java.util.Random;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Random ram = new Random();
		int num = ram.nextInt(100);
		
		System.out.println("Qual o seu chute?");
		Scanner sc = new Scanner(System.in);
		int chute = 0;
		
		do {
			chute =sc.nextInt();
			
			if(chute>num) {
				System.out.println("Chute alto! Digite outro número:");				
			}if(chute<num) {
				System.out.println("Chute baixo! Digite outro número:");
				
			}
		}while(chute!=num);
		
		System.out.println("Você acertou!");
	}

}
