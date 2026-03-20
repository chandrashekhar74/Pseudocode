/*
Called with a=9,b=8 and c=4
Integer funn(Integer a ,Integer b , Integer c)
b=(b+8)+b
c=(9+2)+b
b=(b+b)+c
if (b>c && (9+4)<a)
c=b+a
END if
a=(5+7)a
return a+b+c
End function funn()
 */

public class Question18 {
    public static int funn(int a, int b,int c) {
        b = (b + 8) + b;
        c = (9 + 2) + b;
        b = (b + b) + c;
        if (b > c && (9 + 4) < a) {
            c = b + a;
        }
        a = (5 + 7) + a;
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println(funn(9,8,4));
    }
}
