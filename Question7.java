/*

Integer a,b,c
Set b:=0,c:=0
for each a from 1 to 5 loop
print c
b:=b+1
c:=c+b
Next for

*/
public class Question7 {
    public static void main(String[] args) {
        int a,b,c;
        b=0;
        c=0;
        for(a=1;a<=5;a++)
        {
            System.out.print(" "+c);
            b=b+1;
            c=c+b;
        }
    }
}
