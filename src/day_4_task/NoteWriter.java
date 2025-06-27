package day_4_task;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNote {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("notes.txt", true); // true to append
            writer.write("This is a new note.\n");
            writer.close();
            System.out.println("Note written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
