public class Palindrome {
    public static void isPalindrome(int n)
    {
        int og = n;
        int rev = 0;
        int pow = 0;
        while(n>0)
        {
            int ld = n%10;  //last digit
            rev = rev + (ld * (int)Math.pow(10,pow));
            pow++;
            n = n/10;  //reduce the number
        }

        if(og == rev)
        {
            System.out.println(og + " is palindrome.");
        }
        else {
            System.out.println(og + " is not palindrome.");
        }
    }

    public static void main(String[] args)
    {
        isPalindrome(1222222);
    }
}
