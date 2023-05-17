public class FriendNumbs {
    
    public static void main(String[] args) {
        int numb1 = 1184;
        int numb2 = 1210;
        int toplam1 = 1;
        int toplam2 = 1;

        for(int i=2;i<numb1;i++) {
            if(numb1 % i == 0 ) {
                toplam1 = toplam1 + i;
            }
        }

        
        for(int i=2;i<numb2;i++) {
            if(numb2 % i == 0 ) {
                toplam2 = toplam2 + i;
            }
        }

        if(toplam1 == numb2 & toplam2 == numb1) {
            System.out.println(toplam1);
            System.out.println(toplam2);
            System.out.println("Arkadas Sayi");
        } else {
            System.out.println(toplam1);
            System.out.println(toplam2);
            System.out.println("Arkadas Sayi Degil");
        }

    };
};