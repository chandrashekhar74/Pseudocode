/*
Called with a=9,b=7 and c=20
Integer funn(Integer a ,Integer b , Integer c)
if ((a+c)<(b-a))
c=4+b
b=(c+c)+b
else
c=(a+3)^a
c=(10 & 8)+b
END if
return a+b+c
End function funn()
 */
public class Question17 {
    public static int funn(int a,int b,int c){
        if((a+c)<(b-a))
        {
            c=4+b;
            b=(c+c)+b;
        }
        else
        {
            c=(a+3)^a;
            c=(10 & 8)+b;
        }
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(funn(9,7,20));
    }
}
