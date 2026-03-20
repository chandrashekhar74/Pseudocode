/*

DECLARE num:INTEGER
DECLARE fact:INTEGER
SET fact:=1
READ num
FOR i:=num TO 1 STEP-1
fact:=fact*i
END FOR
PRINT fact

*/
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number");
        int num=input.nextInt();
        int fact=1;
        for(int i=num;i>0;i--)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of"+num+"is = "+fact);
    }
}
