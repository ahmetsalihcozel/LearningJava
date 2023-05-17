package ArrayListsTypedDemo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();

        sehirler.add("Ankara");
        sehirler.add("Istanbul");
        sehirler.add("Manisa");
        sehirler.add("Izmir");
        sehirler.add("Aydin");

        Collections.sort(sehirler);

        for (String sehir : sehirler) {
            System.out.println(sehir);
        }

        System.out.println("");

        sehirler.remove("Izmir");

        for (String sehir : sehirler) {
            System.out.println(sehir);
        }



    };  
    
}
