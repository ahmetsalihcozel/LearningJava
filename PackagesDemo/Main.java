package PackagesDemo;
import java.util.Scanner;
import PackagesDemo.Mathematics.DortIslem;
import PackagesDemo.Mathematics.Logaritma;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adinizi girin: ");

        String isim = scanner.nextLine();

        System.out.println("Merhaba "+isim);

        scanner.close();

        DortIslem dortIslem = new DortIslem();
        int toplam = dortIslem.topla(3, 4);

        System.out.println(toplam);

        Logaritma logaritma = new Logaritma();
        double logaritmaDeger = logaritma.logaritmaHesapla();

        System.out.println(logaritmaDeger);

    }
    
}
