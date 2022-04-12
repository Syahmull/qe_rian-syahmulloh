import java.util.Scanner;

public class JamPasir {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int jumlah = input.nextInt();
        polaJamPasirTerbalik(jumlah);
        polaJamPasir(jumlah);
    }
    public static void polaJamPasir(int tinggi){
        for (int i = 2; i<= tinggi; i++){
            for (int j = 1; j <= (tinggi*2)-1; j++){
                if(Math.abs(tinggi -j)<i){
                    System.out.println( '*');
                } else {
                    System.out.println(' ');
                }
                System.out.println();
            }
        }
    }
    public static void polaJamPasirTerbalik(int tinggi){
        for (int i = tinggi; i>=1;i--){
            for (int j=1;j<=(tinggi*2)-1;j++){
                if (Math.abs(tinggi-j)<i){
                    System.out.println('*');
                }else{
                    System.out.println( ' ' );
                }
            }
        }
    }
}
