/*

DECLARE num:INTEGER
READ num
IF num>0 THEN
PRINT "num is positive"
ELSE
PRINT "num is negative"
END IF

*/

import java.util.*;
public class PositiveNegativeNo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=input.nextInt();
        if(num>0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }
}
