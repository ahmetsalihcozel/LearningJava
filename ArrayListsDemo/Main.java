package ArrayListsDemo;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();

        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Bandirma");
        sayilar.add("Balikesir");
        sayilar.add("Adana");
        sayilar.add(23);

        System.out.println(sayilar.size());
        System.out.println(sayilar.get(2));

        sayilar.set(0, "Ankara");
        System.out.println(sayilar);
        sayilar.remove(2);
        System.out.println(sayilar);


        for(Object obje:sayilar) {
            System.out.println(obje);
        }

        sayilar.clear();

    };  
    
}
