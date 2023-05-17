public class Asal {
    
    public static void main(String[] args) {
        int numb = 29;
        boolean asalmi = true;

        for(int i=2;i<numb;i++) {
            if(numb % i == 0) {
                asalmi = false;
                break;
            }
        }

        if(asalmi) {
            System.out.println("Sayi Asal");
        } else {
            System.out.println("Sayi Asal Degil"); 
        }


    };
};