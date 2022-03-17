package OOP1;

public class Segitiga {
    protected static Integer luas(int alas,int tinggi){
        return (alas*tinggi)/2;
    }
    public static double phytatagoras(double alas, double tinggi) {
        double kuadradAlas = Math.pow(alas,2);
        double kuadradTinggi = Math.pow(tinggi,2);
        return Math.sqrt(kuadradAlas+kuadradTinggi);
    }

    protected static double keliling(double alas, double tinggi){
        return 2*phytatagoras(alas, tinggi)+alas;
    }

}
