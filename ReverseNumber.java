/*

DECLARE num:INTEGER
DECLARE b:INTEGER
DECLARE a:INTEGER
SET b:=0
READ num
WHILE num>0
a:=num MOD 10
b:=b*10+a
num:=num/10
END WHILE
PRINT b

 */
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number ");
        int num=input.nextInt();
        int a,b=0;
        while(num>0)
        {
            a=num%10;
            b=b*10+a;
            num=num/10;
        }
        System.out.println("Reverse of number is "+b);
    }
}
