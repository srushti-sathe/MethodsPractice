import java.util.*;
public class sumOfDigitsInInt {
    public static int sumOfDigits(int n)
    {
        int sum = 0;
        while(n>0)
        {
            int ld = n%10; //last digit of the number
            sum += ld;
            n = n / 10; //reduce number

        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the number::");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Sum of digits in integer::" + sumOfDigits(num));

    }
}
