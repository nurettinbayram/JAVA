import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=null; //bu kisim normalde try bolumunde oluyor ama finally bolumunde erisemedigimiz icin disari cikardik

        try {
            //BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\fakha\\IdeaProjects\\readingFileDemo\\src\\sayilar.txt"));
            reader = new BufferedReader(new FileReader("C:\\Users\\fakha\\IdeaProjects\\readingFileDemo\\src\\sayilar.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            reader.close();// bu okuma kisminda cikacak bir sorunu bu bolumde kapatilmasi gerekiyor
        }
    }
}