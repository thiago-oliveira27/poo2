package lab2.thread.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineCounterThreadsPoolTask implements Runnable{
	private final File file;
    private int linhas;

    public LineCounterThreadsPoolTask(File file) {
        this.file = file;
        linhas = 0;
    }

    public File getFile() {
        return file;
    }

    public int getCount() {
        return linhas;
    }

    @Override
    public void run() {
        try{
            LineNumberReader lineNumRead = null;
            FileReader fReader = new FileReader(file);
            lineNumRead = new LineNumberReader(fReader);

            if(file.isFile()) {
                try {
                    while(lineNumRead.readLine() != null) {

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                linhas += lineNumRead.getLineNumber();
            }

        }
        catch(FileNotFoundException e){
            System.out.println("File não encontrado.");
        }
    }

}
