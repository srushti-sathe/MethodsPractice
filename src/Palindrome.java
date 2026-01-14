import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(int n)
    {
        int og = n;
        int rev = 0;
        while(n>0)
        {
            int ld = n%10;  //last digit
            rev = rev *10 + ld;
            n = n/10;  //reduce the number
        }
        if(og == rev)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Enter the number::");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(isPalindrome(number))
        {
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not plaindrome.");
        }
    }
}
