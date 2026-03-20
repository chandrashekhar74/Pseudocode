/*
PROCEDURE max(a:INTEGER,b:INTEGER)
IF a>b THEN
PRINT a
ELSE
PRINT b
END IF
END PROCEDURE
CALL max(12,3)
 */
import java.util.*;
public class ProcedureMax {
    public static int max(int a,int b){
        if(a>b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of a and b ");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("Max is "+max(a,b));
    }
}
