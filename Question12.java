public class Question12 {
    public static void main(String[] args) {
        int a,b,c;
        b=10;
        c=11;
        a=b-c;
        for(c=2;c>=a;c--)
        {
            b=b+c+10;
            b=b/2;
        }
        c=a+b+c;
        System.out.print(a+" "+ b +" "+c);
    }
}
