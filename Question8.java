/*

Integer value,n
Set value:=32,n:=1
While value Greater Than or Equal to n loop
value:=value>>1
End loop
Print value

*/
public class Question8 {
    public static void main(String[] args) {
        int value,n;
        value=32;
        n=1;
        while(value>=n)
        {
            value=value>>1;
        }
        System.out.println(value);
    }
}
