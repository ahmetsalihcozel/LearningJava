public class PerfectNumber {
    
    public static void main(String[] args) {
        int numb = 8129;
        int toplam = 1;

        for(int i=2;i<numb;i++) {
            if(numb % i == 0 ) {
                toplam = toplam + i;
            }
        }

        if(toplam == numb) {
            System.out.println(toplam);
            System.out.println(numb);
            System.out.println("Mukemmel Sayi");
        } else {
            System.out.println(toplam);
            System.out.println(numb);
            System.out.println("Sayi Mukemmel Degil");
        }


    };
};