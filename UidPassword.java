/*

DECLARE uid:STRING
DECLARE pass:STRING
READ uid,pass
IF uid="TIT" THEN
IF pass="123" THEN
PRINT "Welcome"
ELSE
PRINT "Invalid Password"
END IF
ELSE
PRINT "Invalid uid"
END IF

*/
import java.util.*;
public class UidPassword {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the uid");
        String uid= input.nextLine();
        if(uid.equals("TIT"))
        {
            System.out.println("Enter the password");
            String pass=input.nextLine();
            if(pass.equals("123@"))
            {  System.out.println("Welcome");}
            else
            { System.out.println("Invalid Password");}
        }
        else
        { System.out.println("Invalid uid");}

    }
}
