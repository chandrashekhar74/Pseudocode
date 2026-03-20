/*
Called with a=9,b=5 and c=5
Integer funn(Integer a ,Integer b , Integer c)
a=5&b
c=(11&4)+b
c=c+c
c=(b+11)^b
return a+b+c
End function funn()
 */

public class Question20 {
    public static int funn(int a, int b,int c) {
        a=5&b;
        c=(11&4)+b;
        c=c+c;
        c=(b+11)^b;
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println(funn(9,5,5));
    }
}
