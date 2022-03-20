import java.util.HashSet;
import java.util.Set;

public class Problem_22 {
    public static void main(String[] args) {
        String str = "1122";

        String temp =(str);
        int[] num = new int[temp.length()];
        for (int i = 0; i<temp.length(); i++) {
            num[i] = temp.charAt(i) - '0';
        }

        Set<Integer> number = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            number.add(num[i]);
            number.remove(1);
            number.remove(2);
            System.out.println(number);
        }
    }
}
