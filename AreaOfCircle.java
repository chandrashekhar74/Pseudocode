/*
FUNCTION aoc(rad:REAL):REAL
RETURN 3.14*rad*rad
END FUNCTION
PRINT aoc(6.6)
 */
import java.util.*;
public class AreaOfCircle {
    public static float aoc(float rad){
        return (float)(3.14*rad*rad);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of radius ");
        float rad=input.nextFloat();
        System.out.println("Area of circle is "+aoc(rad));
    }
}
