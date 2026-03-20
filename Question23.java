/*
Called with a=2,b=6 and c=1
Integer funn(Integer a ,Integer b , Integer c)
if((c^b+a)<(a&c))
b=a^b
c=(a+3)+c
End if
if((3^b)+(c^c)>(11&c))
b=(c+12)^a
End if
return a+b+c
End function funn()
 */
public class Question23 {
    public static int funn(int a,int b,int c){
        if((c^b+a)<(a&c))
        {
            b=a^b;
            c=(a+3)+c;
        }
        if((3^b)+(c^c)>(11&c))
        {
            b=(c+12)^a;
        }
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(funn(2,6,1));
    }
}
