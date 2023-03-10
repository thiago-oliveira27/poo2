package lab1.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;

public class LineCounter implements Runnable{

	@Override
	public void run() {
		try {
			long start = System.currentTimeMillis();
			File folder = new File("C:\\sk-java\\studyspace\\poo2\\arqtres");
			int contlinhas = 0;
			LineNumberReader lineNumRead = null;
			File[] listOfFiles = folder.listFiles();
				
			for(File file : listOfFiles) {
				FileReader fReader = new FileReader(file);
				lineNumRead = new LineNumberReader(fReader);
				if(file.isFile()) {
					while(lineNumRead.readLine() != null) {
						
					}
					contlinhas += lineNumRead.getLineNumber();
				}
				
				
			}
			System.out.println("Linhas: "+ contlinhas);
			System.out.println(System.currentTimeMillis() - start);
			
		}catch(FileNotFoundException e) {
			
		}
		
			
		
		
	}
	
}
