/*
PROCEDURE minOfThree(a:INTEGER,b:INTEGER,c:INTEGER)
IF a>b AND b>c THEN
PRINT c
ELSE IF b>a AND c>a
PRINT a
ELSE
PRINT b
END IF
END PROCEDURE
CALL minOfThree(12,3,10)
 */
import java.util.*;
public class ProcedureMinOfThree {
    public static int minOfThree(int a,int b,int c){
        if(a>b&&b>c)
            return c;
        else if(b>a&&c>a)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter three numbers ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        System.out.println("Min of three numbers is "+minOfThree(a,b,c));
    }
}
