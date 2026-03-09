public class Question1 {
    public static void main(String[] args) {
        int p,q,r;
        p=1;
        q=5;
        r=7;
        r=p+q;
        if((3+p)<(q+3))
        {
            if((r+q+8)<(q+p+r))
                r=(r+30)+r;
            else
                r=(q+1)+q;
        }
        else
        {
            if((r+q)<(p+r))
                q=12+q;
            else
            { r=q+p;}
            r=p+q+r;
        }
        r=r+r;
        System.out.println(p+q+r);
    }
}
