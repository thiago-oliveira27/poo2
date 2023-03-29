package lab2.thread.ex2;

import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class LineCounterThreadsPool {
	
	private int count;
    private final File[] files;

    public LineCounterThreadsPool(File[] files){
        this.files = files;
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void iniciar(){
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);

        for(int i = 0; i < files.length; i++){
            File file = files[i];

            LineCounterThreadsPoolTask task = new LineCounterThreadsPoolTask(file);
            executor.execute(task);
            count += task.getCount();
            
        }

        executor.shutdown();

    }

}
