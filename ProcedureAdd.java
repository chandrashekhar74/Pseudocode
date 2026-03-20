/*
PROCEDURE add(a:INTEGER,b:INTEGER)
PRINT a+b
END PROCEDURE
CALL add(12,3)
 */
import java.util.*;
public class ProcedureAdd {
    public static int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the value of a and b ");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("Sum of "+a+" and "+b+" is "+add(a,b));
    }
}
