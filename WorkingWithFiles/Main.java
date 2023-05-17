package WorkingWithFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        createFile();
        getFileInfo();
        readFile();
        writeFile();
    };  




    public static void createFile() {
        File file = new File("C:\\Users\\AHMET\\Desktop\\Java\\WorkingWithFiles\\students.txt");

        try {
            if(file.createNewFile()) {
                System.out.println("Dosya olusturuldu");
            } else {
                System.out.println("Dosya zaten mevcut");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    };

    public static void getFileInfo() {
        File file = new File("C:\\Users\\AHMET\\Desktop\\Java\\WorkingWithFiles\\students.txt");
        if (file.exists()) {
            System.out.println("Dosya adi: "+file.getName());
            System.out.println("Dosya yolu: "+file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi: "+file.canWrite());
            System.out.println("Dosya okunabilir mi: "+file.canRead());
            System.out.println("Dosya boyutu (byte): "+file.length());
        }
    }

    public static void readFile() {
        File file = new File("C:\\Users\\AHMET\\Desktop\\Java\\WorkingWithFiles\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            };
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\AHMET\\Desktop\\Java\\WorkingWithFiles\\students.txt", true));
            writer.newLine();
            writer.write("Melike");
            System.out.println("Dosyaya yazildi.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        
    }
    
}
