package oops;
import java.io.*;
import java.util.Scanner;
public class FileHandlingTrailThree {
    public static void main(String[] args) {
        try {
            File f1 = new File("Ironman.txt");
            File f2 = new File("Ironmantwo.txt");
            Scanner fr = new Scanner(f1);
            FileWriter fw = new FileWriter(f2);
            while (fr.hasNextLine()) {
                fw.write(fr.nextLine());
                fw.write("\n");
            }
            fw.close();
            fr.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
