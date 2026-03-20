/*

DECLARE x:ARRAY[2][2] OF INTEGER or DECLARE x:ARRAY[0:1][0:1] OF INTEGER or Integer x[2][2]
FOR r:=0 TO 1
FOR c:=0 TO 1
READ x[r][c]
END FOR
END FOR
FOR r:=0 TO 1
FOR c:=0 TO 1
PRINT x[r][c]
END FOR
END FOR

 */
import java.util.*;
public class DeclarationOf2DArray {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the element of 2D Array ");
        int[][] x=new int[2][2];
        for(int r=0;r<2;r++)
        {
            for(int c=0;c<2;c++)
            {
                x[r][c]=input.nextInt();
            }
        }
        for(int r=0;r<2;r++)
        {
            for(int c=0;c<2;c++)
            {
                System.out.print(x[r][c]+"  ");
            }
            System.out.println();
        }
    }
}
