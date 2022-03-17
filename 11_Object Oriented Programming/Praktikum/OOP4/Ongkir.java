package OOP4;

public class Ongkir {
    public static void main(String[] args) {
        int volume = volumeharga.volume(5,2,4);
        int harga = volumeharga.harga(1);
        int total = 0;
        if (volume > 50 && volume <= 100){
            total = harga;
            System.out.println("Harga Total = " +total);
        }
        else if (volume > 100 && volume <= 200){
            total = harga + 5000;
            System.out.println("Harga Total = " +total);
        }
        else {
            total = harga;
            System.out.println("Harga Total = " +total);
        }
    }
}
