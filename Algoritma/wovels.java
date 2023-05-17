public class wovels {

    public static void main(String[] args) {
        char letter = 'O';

        String thinVowels = "EÖÜ";
        String thickVowels = "AOU";

        if(thinVowels.indexOf(letter)>=0){
            System.out.println("Harf ince Sesli");
        }else if(thickVowels.indexOf(letter)>=0){
            System.out.println("Harf Kalin Sesli");
        }



    }
    
}
