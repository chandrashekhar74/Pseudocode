/*

INTEGER a,b,c,d
SET b:=10,c:=11
a:=b-c
FOR EACH c FROM 2 TO a LOOP
b:=b+c+10
b:=b/2
NEXT c
c:=a+b+c
PRINT a b c

*/
public class Question12 {
    public static void main(String[] args) {
        int a,b,c;
        b=10;
        c=11;
        a=b-c;
        for(c=2;c>=a;c--)
        {
            b=b+c+10;
            b=b/2;
        }
        c=a+b+c;
        System.out.print(a+" "+ b +" "+c);
    }
}
