
// 151==(Reverse(151))
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number ");
        int num=input.nextInt();
        int a,b=0;
        int n=num;
        while(num>0)
        {
            a=num%10;
            b=b*10+a;
            num=num/10;
        }
        if(n==b)
        System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
