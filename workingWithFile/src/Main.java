import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //createFile();
        //getFileInfo();
        readFile(); //dosya icini okuma
        writeFileApend();
        readFile();
    }

    public static  void createFile(){//bu fonksiyon dosya olusturur
        File file = new File("C:\\Users\\fakha\\IdeaProjects\\FileFolder\\student.txt");
        try {
            if (file.createNewFile()){//dosya var mi?
                System.out.println("Dosya olusturuldu.");
            }else {
                System.out.println("Bu dosya zaten mevcut");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public  static  void getFileInfo(){
        File file = new File("C:\\Users\\fakha\\IdeaProjects\\FileFolder\\student.txt");
        if (file.exists()){
            System.out.println("Dosya Adi: "+file.getName());//dosya ismini alir
            System.out.println("Dosya Yolu: " + file.getAbsolutePath());//dosya yolunu dizinini
            System.out.println("Dosya yazilabilir mi? : " + file.canWrite());//dosya
            System.out.println("Dosya Okunabilir mi? : " + file.canRead());//dosya
            System.out.println("Dosya Boyutu (Byte) : " + file.length());//dosya
        }
    }

    public static  void readFile(){
        File file = new File("C:\\Users\\fakha\\IdeaProjects\\FileFolder\\student.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static  void writeFileOverWride(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\fakha\\IdeaProjects\\FileFolder\\student.txt"));
            writer.write("Ahmet");//dosya uzerine yazar dosyada olani siler
            System.out.println("Dosyaya yazildi");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static  void writeFileApend(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\fakha\\IdeaProjects\\FileFolder\\student.txt", true));// buradaki true ozelligi ile ekleme yapar
            writer.newLine();//alt satira gecir
            writer.write("Ahmet");//dosya uzerine yazar dosyada olani siler
            System.out.println("Dosyaya yazildi");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}