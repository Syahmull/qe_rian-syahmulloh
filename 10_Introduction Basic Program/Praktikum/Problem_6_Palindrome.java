public class Problem_6_Palindrome {
    static boolean isPalindrose(String str)
    {
       int i = 0, j = str.length() - 1;
       while (i < j) {

           if (str.charAt(i) != str.charAt(j)) {
               return false;
           }
           i++;
           j--;
       }
       return true;
    }

    public static void main(String[] args)
    {
        if (isPalindrose("geeks"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
