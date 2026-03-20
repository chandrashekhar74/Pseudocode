/*
FUNCTION aot(b:REAL,h:REAL):REAL
RETURN 0.5*b*h
END FUNCTION
PRINT aot(2.5,5.0)
 */
import java.util.*;
public class AreaOfTriangle {
    public static float aot(float base,float height){
        return (float)(0.5*base*height);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of base ");
        float base=input.nextFloat();
        System.out.print("Enter the value of height ");
        float height=input.nextFloat();
        System.out.println("Area of circle is "+aot(base,height));
    }
}
