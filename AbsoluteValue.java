/*
FUNCTION abs(num:INTEGER):INTEGER
IF num>0 THEN
RETURN num
ELSE
RETURN -(num)
END IF
END FUNCTION
PRINT abs(num)
 */
import java.util.*;
public class AbsoluteValue {
    public static int abs(int num){
        if(num>0)
            return num;
        else
            return -(num);
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number ");
        int num=input.nextInt();
        System.out.println("Absolute value is "+abs(num));
    }
}
