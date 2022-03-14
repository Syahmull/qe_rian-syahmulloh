public class Problem_5_Bilangan_Prima {

    private static int isPrime (int num) {
        int count=0;
        for(int i=1; i<=num; i++){
            if (num%i ==0)
            {
                count = count+1;
                System.out.println(count);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num = isPrime(7);
        if (num==2) System.out.println("True");
        else System.out.println("False");
    }
}
