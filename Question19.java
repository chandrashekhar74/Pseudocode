/*
Called with a=9,b=5 and c=4
Integer funn(Integer a ,Integer b , Integer c)
c= a & c
c=(a+b)+b
a=(c+a)&c
b=2^a
return a+b+c
End function funn()
 */

public class Question19 {
    public static int funn(int a, int b,int c) {
        c = (a & c) ;
        c = (a + b) + b;
        a = (c + a) & c;
        b=2^a;
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println(funn(9,5,4));
    }
}
