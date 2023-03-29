package lab2.thread.ex3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineCounterNoThreads {
	
	private static int count;
	
	private LineNumberReader lineReader;
    private int linesNumber = 0;

    public LineCounterNoThreads(LineNumberReader lineReader) {
        this.lineReader = lineReader;
    }

    public static void read(File[] files) {
    	
    	for(int i = 0; i < files.length; i++){
            File file = files[i];

            try{
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;

                while((line = bufferedReader.readLine()) != null){
                	
                    count++;
                }
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public int getLinesNumber() {
        return this.linesNumber;
    }
}






