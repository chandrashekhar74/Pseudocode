/*

DECLARE a:ARRAY[5] OF INTEGER
DECLARE max:INTEGER
FOR i:=0 TO 4
READ a[i]
END FOR
SET max:=a[0]
FOR i:=0 TO 4
IF a[i]>max THEN
max:=a[i]
END IF
END FOR
PRINT max

 */
import java.util.*;
public class MaxElementOfArray {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the Array Element ");
        int []a=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=input.nextInt();
        }
        int max=a[0];
        for(int i=1;i<5;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        System.out.print("Max of Array Element is "+max);
    }
}
