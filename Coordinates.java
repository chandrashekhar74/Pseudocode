/*

DECLARE x:INTEGER
DECLARE y:INTEGER
READ x,y
IF x>0
IF y>0
PRINT "1st Quadrant"
ELSE
PRINT "4th Quadrant"
END IF
ELSE
IF y>0
PRINT "2nd Quadrant"
ELSE
PRINT "3rd Quadrant"
END IF


*/

import java.util.*;
public class Coordinates {
    public static void main(String[] args) {
        int x,y;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter x and y");
        x=input.nextInt();
        y=input.nextInt();
        if(x>0)
        {
            if(y>0)
                System.out.println("1st Quadrant");
            else
                System.out.println("4th Quadrant");
        }
        else
        {
            if(y>0)
                System.out.println("2nd Quadrant");
            else
                System.out.println("3rd Quadrant");
        }
    }
}
