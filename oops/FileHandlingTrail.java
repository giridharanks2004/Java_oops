package oops;
import java.io.File;
import java.util.Scanner;
public class FileHandlingTrail {
    public static void main(String[] args) {
        try{
            File f = new File("Ironman.txt");
            Scanner reader = new Scanner(f);
            while (reader.hasNextLine()) {
                System.err.println(reader.nextLine());
            }
            reader.close();
        }
        catch(Exception E){
            System.out.println(E.getMessage());
        }
        
    }
}