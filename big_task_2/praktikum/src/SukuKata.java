import java.util.ArrayList;

public class SukuKata {
    public static void main(String[] args) {
        String input = "kapasitas";
        ArrayList<String> output = new ArrayList<>();
        for (int i=0; i<input.length(); i++){
            if (input.charAt(i) == 'a' || input.charAt(i) == 'i' || input.charAt(i) == 'u' || input.charAt(i) == 'e'){
                output.add(".");
            }
            else if (input.charAt(i) == 'o') output.add("-");
        }
        System.out.println(output);
    }
}
