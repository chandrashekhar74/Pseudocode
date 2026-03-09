public class Question3 {
    public static void main(String[] args) {
        int p,q,r;
        p=4;
        q=2;
        r=8;
        for(r=5;r<=6;r++)
        {
            p=(r+r)^r;
            q=(8+3)+p;
        }
        for(r=5;r<=8;r++)
        {
            p=4+r;
            p=1+q;
        }
        System.out.println(p+q);
    }
}
