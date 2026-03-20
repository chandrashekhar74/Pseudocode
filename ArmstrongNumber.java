/*
153=1^3+5^3+3^3(1+125+27=153)
DECLARE num:INTEGER
DECLARE b:INTEGER
DECLARE a:INTEGER
DECLARE n:INTEGER
SET b:=0;
SET n:=num
READ num

WHILE num>0
    a:=num MOD 10
    b:=b+a*a*a
    num:=num/10
    END WHILE
    IF n==b THEN
    PRINT "Armstrong"
    ELSE
    PRINT "Not Armstrong"
    END IF

*/


import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=input.nextInt();
        int b=0;
        int n=num;
        while(num>0)
        {
            int a=num%10;
            b=b+a*a*a;
            num=num/10;
        }
        if(n==b)
        System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
