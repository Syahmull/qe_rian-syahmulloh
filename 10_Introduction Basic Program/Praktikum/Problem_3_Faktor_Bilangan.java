import java.util.Scanner;

public class Problem_3_Faktor_Bilangan {
    public static void main(String[] args) {

        int bilangan = 6;
        for (int i = 1; i <=bilangan; i++) {
            if (bilangan % i == 0){
                System.out.println( "Outputnya 6 :" + i );
            }
        }
        int bilangan2 = 20;
        for (int i = 1; i <=bilangan2; i++) {
            if (bilangan2 % i == 0){
                System.out.println( "Outputnya 20 :" + i );
            }
        }
    }
}
