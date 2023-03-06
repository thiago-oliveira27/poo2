package lab0.ex4ao9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Atleta> atletasArray = new ArrayList<Atleta>();
		Atleta[] atletasVet = new Atleta[5];
		String line = "_______________________________________________";
		Random ram = new Random();
			
		atletasArray.add(new Corredor("Luis", 20, 70, 1.8));
		atletasArray.add(new Futebolista("Thiago", 21, 72, 1.9));
		atletasArray.add(new Tenista("Vini", 22, 76, 1.67));
		atletasArray.add(new Corredor("Ribeiro", 27, 73, 1.75));
		atletasArray.add(new Futebolista("Dathan", 19, 76, 1.75));
			
		atletasVet[0] = new Corredor("Vini", 20, 70, 1.8);
		atletasVet[1] = new Corredor("Thiago", 20, 70, 1.8);
		atletasVet[2] = new Corredor("Luis", 20, 70, 1.8);
		atletasVet[3] = new Corredor("Dathan", 20, 70, 1.8);
		atletasVet[4] = new Corredor("Xavier", 20, 70, 1.8);
	
		Collections.sort(atletasArray);	
		System.out.println("Array ordenado por nome:");
		atletasArray.forEach(a -> System.out.println(a.getNome()));
		 
		System.out.println(line);
		
		Arrays.sort(atletasVet);
		System.out.println("Vetor ordenado por nome:");
		for (Atleta atleta : atletasVet) {
            System.out.println(atleta.getNome());
        }
		
		System.out.println("\n*****Chamando os metodos para cada atleta do ARRAYLIST...*****\n");
		for(Atleta atl : atletasArray) {
			int aquece = ram.nextInt(60);
			System.out.print("Atleta: " + atl.getNome() + " - ");
			atl.aquecer(aquece);
			atl.jogar();
			System.out.println(line);
			
		}
		
		System.out.println("\n*****Chamando os metodos para cada atleta do VETOR...*****\n");
		for(Atleta atl : atletasVet) {
			int aquece = ram.nextInt(60);
			System.out.print("Atleta: " + atl.getNome() + " - ");
			atl.aquecer(aquece);
			atl.jogar();
			System.out.println(line);
			
		}
		//Chamando metodo do exercicio 8 - calcularProximaOlimpiada
		Date dataProximaOlimpiada = calcularProximaOlimpiada();
		
        System.out.println("Data da próxima Olimpíada: " + dataProximaOlimpiada);

	}
	
	public static Date calcularProximaOlimpiada() {

        LocalDate hoje = LocalDate.now();
        LocalDate proximaOlimpiada = LocalDate.of(2024, 7, 23);
        long diasRestantes = hoje.until(proximaOlimpiada, ChronoUnit.DAYS);
        System.out.println("Faltam " + diasRestantes + " dias para a próxima Olimpíada");
        return java.sql.Date.valueOf(proximaOlimpiada);
		
	}

}
