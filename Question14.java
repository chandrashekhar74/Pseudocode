/*

INTEGER p,q,r,s
SET p:=6,q:=4,r:=4
r=(r+p)+q
IF ((q+p)<(10-q) THEN
r=12+q
p=(q+4)+r
END IF
PRINT p+q+r

*/
public class Question14 {
    public static void main(String[] args) {
        int p,q,r;
        p=6;
        q=4;
        r=4;
        r=(r+p)+q;
        if((q+p)<(10-q))
        {
            r=12+q;
            p=r+r;
            q=(q+4)+r;
        }
        System.out.println(p+q+r);
    }
}
