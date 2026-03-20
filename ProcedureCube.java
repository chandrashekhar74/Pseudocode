/*
PROCEDURE cube(num:INTEGER)
PRINT num*num*num
END PROCEDURE
CALL cube(3)
 */
import java.util.*;
public class ProcedureCube {
    public static int cube(int num){
        return num*num*num;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the num ");
        int num=input.nextInt();
        System.out.println("Cube of "+num+" is "+cube(num));
    }
}
