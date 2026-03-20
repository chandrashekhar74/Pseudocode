/*

DECLARE num:INTEGER
READ num
IF num MOD 2 == 0 THEN
PRINT "Even"
ELSE
PRINT "Odd"
END IF

 */
import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=input.nextInt();
        if(num%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
