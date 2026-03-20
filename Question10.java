/*

INTEGER a,b,c
SET c:=12,b:=4
a:=c/b
c:=b>>a
PRINT c

*/
public class Question10 {
    public static void main(String[] args) {
        int a,b,c;
        c=12;
        b=4;
        a=c/b;
        c=b>>a;
        System.out.println(c);
    }
}
