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
                System.out.println("4th Quadrant");
        }
    }
}
