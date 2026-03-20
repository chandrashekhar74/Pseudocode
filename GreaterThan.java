/*

DECLARE x:INTEGER
READ x
IF x>=5  THEN
PRINT "x is greater than or equal to 5"
END IF

*/


import java.util.*;
public class GreaterThan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= input.nextInt();
        if(num>=5)
            System.out.println("Number is greater than or equal to 5");
        else
            System.out.println("Number is smaller than 5");
    }
}

