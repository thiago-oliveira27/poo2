package lab2.thread.ex1;

import java.io.File;
import java.io.IOException;

import lab2.thread.ex2.LineCounterThreadsPool; 

public class Main {
	
	public static void main(String args[]) throws IOException {
		    

	        long tempoInicial = System.currentTimeMillis();
	        File dir = new File("src/arqs");
	        File[] files = dir.listFiles();

	        LineCounterThreadsImpl.run(files);

	        System.out.println("Tempo: " + (System.currentTimeMillis() - tempoInicial));
	        
	        
	        /*
		     Todos arquivos lidos tem 1301 linhas e 3090 caracteres
		      
		     *TEMPO DE LEITURA*
		    
		    - Leitura de 10 arquivos: 90ms
		  
		    
		    - Leitura de 100 arquivos: 250ms
		    
		    
		    - Leitura de 1000 arquivos: 560ms
		*/
	    }
	
}
