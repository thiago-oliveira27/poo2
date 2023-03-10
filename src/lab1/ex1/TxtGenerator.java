package lab1.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TxtGenerator {
    public static void main(String[] args) {
        int n = 1000; // Change n to the number of text archives you want to generate
        String filePrefix = "text_archive_"; // Change this to the prefix you want for your text archive file names
        
        for (int i = 1; i <= n; i++) {
            String fileName = filePrefix + i + ".txt";
            try {
                File file = new File(fileName);
                FileWriter writer = new FileWriter(file);
                writer.write("This is text archive " + i + ".");
                writer.close();
            } catch (IOException e) {
                System.out.println("An error occurred while creating the text archive.");
                e.printStackTrace();
            }
        }
        
        System.out.println("Text archives created successfully.");
    }
}
