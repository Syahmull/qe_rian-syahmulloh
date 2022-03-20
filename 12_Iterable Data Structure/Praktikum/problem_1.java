import java.util.HashSet;
import java.util.Set;

public class problem_1 {
    public static void main(String[] args) {
        Set<String> data = new HashSet<>();
        data.add("kazuya");
        data.add("jin");
        data.add("lee");
        data.add("kazuya");
        data.add("feng");

        System.out.println(data);
    }
}
