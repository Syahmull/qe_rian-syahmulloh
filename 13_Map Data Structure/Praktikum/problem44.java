import java.util.HashMap;
import java.util.Map;

public class problem44 {
    public static void main(String[] args) {
        Map<String, Integer> angka = new HashMap<>();
        angka.put("a", 3 );
        angka.put("", 8 );
        angka.put("", 2 );
        angka.put("", 8 );
        angka.remove("",8);
        System.out.println(angka);
    }
}
