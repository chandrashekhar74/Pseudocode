/*

DECLARE x:ARRAY[3][3] OF INTEGER
DECLARE cntEven:INTEGER
DECLARE cntOdd:INTEGER
SET cntEven:=0
SET cntOdd:=0
FOR r:=0 TO 2
FOR c:=0 TO 2
READ x[r][c]
END FOR
END FOR
FOR r:=0 TO 2
FOR c:=0 TO 2
IF x[r][c] MOD 2 == 0 THEN
INCREMENT OF cntEven
ELSE
INCREMENT OF cntOdd
END IF
END FOR
END FOR
PRINT cntEven
PRINT cntOdd

 */
import java.util.*;
public class CountEvenOddIn2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element of 2D Array ");
        int cntEven=0;
        int cntOdd=0;
        int[][] x = new int[3][3];
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                x[r][c] = input.nextInt();
            }
        }
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(x[r][c] + " ");
                if(x[r][c]%2==0)
                    cntEven++;
                else
                    cntOdd++;
            }
            System.out.println();
        }
        System.out.println("Number of even element is "+cntEven);
        System.out.print("Number of odd element is "+cntOdd);
    }
}
