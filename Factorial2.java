/*
FUNCTION factorial(num:INTEGER):INTEGER
DECLARE fact:INTEGER
SET fact:=1
FOR i FROM num TO 1 STEP-1
fact=fact*i
END FOR
RETURN fact
END FUNCTION
PRINT factorial(5)
 */
import java.util.*;
public class Factorial2 {
    public static int fact(int num){
       int fact=1;
       for(int i=num;i>0;i--)
       {
           fact*=i;
       }
        return fact;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number ");
        int num=input.nextInt();
        System.out.println("Factorial is "+fact(num));
    }
}
