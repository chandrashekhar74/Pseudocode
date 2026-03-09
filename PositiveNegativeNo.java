import java.util.*;
public class PositiveNegativeNo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enetr the number");
        int num=input.nextInt();
        if(num>0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }
}
