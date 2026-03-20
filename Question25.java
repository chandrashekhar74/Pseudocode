/*
What will the value of s if n=127
Read n
i=0,s=0
Function sample(int n)
while(n>0)
r=n%10
p=8^i
s=s+p*r
i++
n=n/10
end while
return s
 */
public class Question25 {
    public static int sample(int n){
        int i=0,s=0;
        while(n>0){
            int r=n%10;
            int p=(int)Math.pow(8,i);
            s=s+p*r;
            i++;
            n=n/10;

        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sample(127));
    }
}
