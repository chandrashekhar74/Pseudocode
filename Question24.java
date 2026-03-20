/*
Called with a=3,b=8 and c=7
Integer funn(Integer a ,Integer b , Integer c)
if((c^8)<8)
c=a+c
c=a+c
End if
return a+b+c
End function funn()
 */
public class Question24 {
    public static int funn(int a,int b,int c) {
        if ((c ^ 8) < 8) {
            c = a + c;
            c = a + c;
        }
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println(funn(3,8,7));
    }
}

