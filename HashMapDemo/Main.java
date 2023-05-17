package HashMapDemo;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<String, String>();
        sozluk.put("book", "kitap");
        sozluk.put("table", "masa");
        sozluk.put("computer", "bilgisayar");

        for (String item : sozluk.keySet()) {
            System.out.println("Eleman: "+item+" - Deger:"+sozluk.get(item));
        }

        System.out.println(sozluk);


        System.out.println(sozluk.get("table"));

        sozluk.remove("table");

        System.out.println(sozluk.size());

        System.out.println(sozluk);

        sozluk.clear();

    };  
    
}
