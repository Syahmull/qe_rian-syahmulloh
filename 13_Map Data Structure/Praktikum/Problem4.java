import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    public static void main(String[] args) {
        Map<String, Integer> angka = new HashMap<>();
        angka.put("", 1 );
        angka.put("a", 2 );
        angka.put("", 3 );
        angka.put("b", 4 );
        angka.put("", 1 );
        angka.put("", 3 );
        angka.put("", 5 );
        angka.put("", 10 );
        angka.put("", 16 );
        angka.remove("",16);
        System.out.println(angka);
    }


}
