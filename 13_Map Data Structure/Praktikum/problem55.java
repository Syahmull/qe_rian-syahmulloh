import java.util.HashMap;

public class problem55 {
    static void removeDups(int[] arr, int n) {
        HashMap<Integer, String> mp = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            if (mp.get(arr[i]) == null)
                System.out.print(" ");
            mp.put(arr[i],  " ");
        }
        System.out.println("" +mp.size());
    }
    public static void main(String[] args)
    {
        int[] arr = { 2, 2, 2, 11, 11 };
        int n = arr.length;
        removeDups(arr, n);
    }
}
