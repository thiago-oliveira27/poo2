package lab0.ex1;

import java.util.Scanner;

public class ex1 {

	//Fa�a um programa que l� 2 strings e checa se a primeira termina com os caracteres da segunda.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String um, dois;
		System.out.println("String 1:");
		um = sc.nextLine();
		System.out.println("String 2:");
		dois = sc.nextLine();
		
		if(um.endsWith(dois)) {			
				System.out.println("As strings terminam com as mesmas letras!");
				System.exit(0);
		}
			
			System.out.println("As string N�O terminam com as mesmas letras");
		       

		}
		
		
	}


