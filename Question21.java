/*
Called with a=3,b=4 and c=9
Integer funn(Integer a ,Integer b , Integer c)
b=(c+3)+a
b=(c+c)+b
c=(c+5)+c
c=(b&8)+b
c=(a+3)+a
return a+b+c
End function funn()
 */

public class Question21 {
    public static int funn(int a, int b,int c) {
        b=(c+3)+a;
        b=(c+c)+b;
        c=(c+5)+c;
        c=(b&8)+b;
        c=(a+3)+a;
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println(funn(3,4,9));
    }
}

