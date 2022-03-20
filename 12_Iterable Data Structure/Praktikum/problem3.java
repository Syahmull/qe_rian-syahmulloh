public class problem3 {
    private static  int[] findTwoSum(int arr[], int sum)
    {
        for (int i = 0; i < arr.length; i++){
            for (int j =i+1; j< arr.length; j++) {
                if(arr[i] + arr[j] ==(sum)){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args)
    {
        int A[] = {1, 2, 3, 4, 6};
        int n = 6;
        int [] indices = findTwoSum(A,n);
        System.out.println(indices[0] + " " + indices[1]);
    }
}
