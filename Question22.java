/*
What's returned for a=4,b=3 ?
Integer computeValue(Integer a,Integer b)
Integer result=1
while(b>0)
if(b mod 2 Equals 1)
result=result*a;
a=a*a
b=b/2
End while
return result
End Function
 */
public class Question22 {
    public static int computeValue(int a,int b){
        int result=1;
        while(b>0)
        {
            if(b%2==1)
            {
                result=result*a;
                a=a*a;
                b=b/2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(computeValue(4,3));
    }
}
