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
		
		Scanner sc = new Scanner(System.in);
		String um;
		System.out.println("Digite a String:");
		um = sc.nextLine();
		int stringSize = um.length();

        Map<Character,Integer> count = new HashMap<Character,Integer>();
        
        for(int i=0;i<um.length();i++) {
        	count.put(um.charAt(i),0);
        
        }
        
       for(int i=0;i<count.size();i++) {
    	   count.put(um.charAt(i),  um.charAt(i)+1);
       }
		
       for(int i=0;i<count.size();i++) {
       }
       System.out.println(count.values());
	}

}
