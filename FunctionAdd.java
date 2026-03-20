/*
FUNCTION add(a:INTEGER,b:INTEGER):INTEGER
RETURN a+b
END FUNCTION
PRINT add(2,3)
 */
import java.util.*;
public class FunctionAdd {
    public static int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the value of a ");
        int a=input.nextInt();
        System.out.print("Enter the value of b ");
        int b=input.nextInt();
        System.out.println("Sum is "+add(a,b));
    }
}
