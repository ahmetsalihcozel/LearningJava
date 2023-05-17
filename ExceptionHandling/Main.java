package ExceptionHandling;

public class Main {


    public static void main(String[] args) {

        try {
            int[] sayilar = new int[] {0, 1, 3};
            System.out.println(sayilar[5]);
        } 
        
        catch (StringIndexOutOfBoundsException exception) {
            System.out.println(exception+"StringIndex");

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception+"ArrayIndex");

        } finally {
            System.out.println("Her durumda calisir.");
        }

    };  
    
}
