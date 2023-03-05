package lab0.ex2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ex2 {
	// Faça um programa que lê uma string e conta os caracteres que aparecem nela, 
			//colocando caracteres e suas quantidades em um HashMap.
			//Ao terminar a leitura, o programa mostra os caracteres e a quantidade de cada um.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String str = scanner.nextLine();
        
        Map<Character, Integer> contador = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (contador.containsKey(c)) {
                contador.put(c, contador.get(c) + 1);
            } else {
                contador.put(c, 1);
            }
        }
        System.out.println("Caracteres e suas repetições:");
        for (Map.Entry<Character, Integer> entry : contador.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
