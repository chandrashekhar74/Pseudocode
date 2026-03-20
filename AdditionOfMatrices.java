/*

DECLARE x:ARRAY[3][3] OF INTEGER
DECLARE y:ARRAY[3][3] OF INTEGER
DECLARE z:ARRAY[3][3] OF INTEGER
FOR r:=0 TO 2
FOR c:=0 TO 2
READ x[r][c]
READ y[r][c]
END FOR
END FOR
FOR r:=0 TO 2
FOR c:=0 TO 2
z[r][c]:=x[r][c]+y[r][c]
END FOR
END FOR
FOR r:=0 TO 2
FOR c:=0 TO 2
PRINT z[r][c]
END FOR
END FOR

 */
import java.util.*;
public class AdditionOfMatrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] x = new int[3][3];
        int[][] y = new int[3][3];
        int[][] z = new int[3][3];
        System.out.println("Enter the element of 1st Matrix ");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                x[r][c] = input.nextInt();
            }
        }
        System.out.println("Enter the element of 2nd Matrix ");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                y[r][c] = input.nextInt();
            }
        }
        System.out.println("1st Matrix is ");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(x[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println("2nd Matrix is ");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(y[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of Matrix x and y is ");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                z[r][c]=x[r][c]+y[r][c];
                System.out.print(z[r][c] + " ");
            }
            System.out.println();
        }
    }
}
