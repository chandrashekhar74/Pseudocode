/*

DECLARE a:ARRAY[0:4] OF INTEGER
FOR i:=0 TO 4
READ a[i]
END FOR
FOR i:=0 TO 4
PRINT a[i]
END FOR

 */

import java.util.*;
public class DeclarationOfArray {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the Array Element ");
        int []array=new int[5];
        for(int i=0;i<5;i++)
        {
            array[i]=input.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
