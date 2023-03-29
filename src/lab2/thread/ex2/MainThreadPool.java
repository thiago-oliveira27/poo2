package lab2.thread.ex2;

import java.io.File;

public class MainThreadPool {

	public static void main(String[] args) throws InterruptedException {
		
		
	    File dir = new File("src/arqs");
	    File[] files = dir.listFiles();
	
	    assert files != null;
	    
	    long tempoInicial = System.currentTimeMillis();
	    
	    LineCounterThreadsPool lineCounterThreadsPool = new LineCounterThreadsPool(files);
        lineCounterThreadsPool.iniciar();
	
	    System.out.println("Tempo de leitura: " + (System.currentTimeMillis() - tempoInicial));
	    
	    
	    /*
	     Todos arquivos lidos tem 1301 linhas e 3090 caracteres
	      
	     *TEMPO DE LEITURA*
	    
	    - Leitura de 10 arquivos: 8ms
	  
	    
	    - Leitura de 100 arquivos: 13ms
	    
	    
	    - Leitura de 1000 arquivos: 80ms
	*/
	}
}
