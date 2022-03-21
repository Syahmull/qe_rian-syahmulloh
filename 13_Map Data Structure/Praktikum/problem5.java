import java.util.HashMap;

public class problem5 {
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
        int[] arr = { 2, 3, 3, 3, 6, 9, 9 };
        int n = arr.length;
        removeDups(arr, n);
    }
}
