/*
Called with a=9,b=7
Integer funn(Integer a ,Integer b)
DECLARE c:INTEGER
SET c:=2
b:=b mod c
a:=a mod c
return a+b
End function funn()
 */
public class Question16 {
    public static int funn(int a,int b){
        int c=2;
        b=b%c;
        a=a%c;
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(funn(9,7));
    }
}
