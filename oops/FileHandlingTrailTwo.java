package oops;
import java.io.*;
public class FileHandlingTrailTwo {
    public static void main(String[] args) {
        try {
            File f = new File("Ironman.txt");
            FileWriter fw = new FileWriter(f);
            fw.write("I am Iron Man!");
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
