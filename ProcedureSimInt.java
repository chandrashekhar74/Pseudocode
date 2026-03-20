/*
PROCEDURE simInt(pa:INTEGER,roi:REAL,noy:REAL)
DECLARE si=REAL
si=(pa*roi*noy)/100
PRINT si
END PROCEDURE
CALL simInt(1000,3.4,4.5)
 */
import java.util.*;
public class ProcedureSimInt {
    public static float simInt(int pa,float roi,float noy){
        return (pa*roi*noy)/100;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter principal ");
        int pa=input.nextInt();
        System.out.print("Enter rate of interest ");
        float roi=input.nextFloat();
        System.out.print("Enter number of year ");
        float noy=input.nextFloat();
        System.out.println("Simple Interest is "+simInt(pa,roi,noy));
    }
}
