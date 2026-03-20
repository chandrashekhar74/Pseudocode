/*
FUNCTION max(a:INTEGER,b:INTEGER):INTEGER
IF a>b THEN
RETURN a
ELSE
RETURN b
END IF
END FUNCTION
PRINT max(12,3)
 */
import java.util.*;
public class GreatestOfTwoNumber {
    public static int max(int a,int b){
        if(a>b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the value of a ");
        int a=input.nextInt();
        System.out.print("Enter the value of b ");
        int b=input.nextInt();
        System.out.println("Greatest number is "+max(a,b));
    }
}
