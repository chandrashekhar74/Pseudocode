/*

Integer a,b,c
Set b=4,c=5
for each a from 2 to 4 loop
Print c
b:=b-1
c:=c+b
Next for

*/
public class Question6 {
    public static void main(String[] args) {
        int a,b,c;
        b=4;
        c=5;
        for(a=2;a<=4;a++)
        {
            System.out.print(" " +c);
            b=b-1;
            c=c+b;
        }
    }
}
