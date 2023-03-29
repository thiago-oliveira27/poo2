package lab2.thread.ex1;

import java.io.File;

public class LineCounterThreadsImpl {

	private static int count;

//    public static int getCount() {
//        return count;
//    }

    public static void run(File[] arqs) {
    		
        LineCounterThreads[] counter = new LineCounterThreads[arqs.length];

        for (int i = 0; i < arqs.length; i++) {
        	counter[i] = new LineCounterThreads(arqs[i]);
        	counter[i].start();
        }

        for(int i = 0; i < counter.length; i++){
            LineCounterThreads lineCounter = counter[i];
            try{
                lineCounter.join();
                count += lineCounter.getCount();
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
	
}
