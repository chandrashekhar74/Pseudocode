//153=1^3+5^3+3^3(1+125+27=153)
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
