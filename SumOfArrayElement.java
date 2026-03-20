/*

DECLARE a:ARRAY[5] OF INTEGER
DECLARE sum:INTEGER
SET sum:=0
FOR i:=0 TO 4
READ a[i]
END FOR
FOR i:=0 TO 4
sum:=sum+a[i]
END FOR
PRINT sum

 */
import java.util.*;
public class SumOfArrayElement {
        public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            System.out.println("Enter the Array Element ");
            int []a=new int[5];
            int sum=0;
            for(int i=0;i<5;i++)
            {
                a[i]=input.nextInt();
            }
            for(int i=0;i<5;i++)
            {
                sum=sum+a[i];
            }
            System.out.print("Sum of Array Element is "+sum);
    }
}
