package lab2.thread.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineCounterThreads  extends Thread{

	private File file;
    private int count;

    public LineCounterThreads(File file){
        this.file = file;
    }

    public int getCount() {
        return count;
    }


    @Override
    public void run() {
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while(bufferedReader.readLine() != null){
                count++;
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
