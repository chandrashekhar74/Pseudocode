/*

151==(Reverse(151))
DECLARE n:INTEGER
DECLARE num:INTEGER
DECLARE b:INTEGER
DECLARE a:INTEGER
SET b:=0
READ num
SET n:=num
WHILE num>0
a:=num MOD 10
b:=b*10+a
num:=num/10
END WHILE
IF n==b THEN
PRINT "Palindrome"
ELSE
PRINT "Not Palindrome"
END IF

 */
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
