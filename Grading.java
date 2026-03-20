/*

DECLARE cn:INTEGER
DECLARE cd:INTEGER
DECLARE pm:INTEGER
DECLARE dbms:INTEGER
DECLARE ml:INTEGER
READ cn,cd,pm,dbms,ml
DECLARE per:REAL
per:=(cn+cd+pm+dbms+ml)/5
IF per>=90 THEN
PRINT "A+"
ELSE IF per>=80 THEN
PRINT "A"
ELSE IF per>=70 THEN
PRINT "B+"
ELSE IF per>=60 THEN
PRINT "B"
ELSE IF per>=50 THEN
PRINT "C"
ELSE IF per>=40 THEN
PRINT "D"
ELSE
PRINT "F"
END IF


*/
import java.util.*;
public class Grading {
    public static void main(String[] args) {
        int cn,cd,pm,dbms,ml;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the marks obtained ");
        cn=input.nextInt();
        cd=input.nextInt();
        pm=input.nextInt();
        dbms=input.nextInt();
        ml=input.nextInt();
        float per;
        per=(cn+cd+pm+dbms+ml)/5;
        if(per>=90)
            System.out.println("A+");
        else if(per>=80)
            System.out.println("A");
        else if(per>=70)
            System.out.println("B+");
        else if(per>=60)
            System.out.println("B");
        else if(per>=50)
            System.out.println("C");
        else if(per>40)
            System.out.println("D");
        else
            System.out.println("Fail");
    }
}
