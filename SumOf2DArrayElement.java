/*

DECLARE x:ARRAY[2][2] OF INTEGER
DECLARE sum:INTEGER
SET sum:=0
FOR r:=0 TO 1
FOR c:=0 TO 1
READ x[r][c]
END FOR
END FOR
FOR r:=0 TO 1
FOR c:=0 TO 1
sum=sum+x[r][c]
END FOR
END FOR
PRINT sum

 */
import java.util.*;
public class SumOf2DArrayElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element of 2D Array ");
        int sum=0;
        int[][] x = new int[2][2];
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 2; c++) {
                x[r][c] = input.nextInt();
            }
        }
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 2; c++) {
                System.out.print(x[r][c]+" ");
                sum = sum + x[r][c];
            }
            System.out.println();
        }
        System.out.print("Sum of element is "+sum);
    }
}
