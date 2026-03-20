/*

DECLARE p,q,r:INTEGER
SET q:=30,p:=10,r:=20
IF (r>(r+p)) THEN
q:=1
ELSE
p:=p-2
r=r-2
END IF
IF (r>(q+p)) THEN
q=(0^5)
ELSE
p=p+2
r=p+2
END IF
PRINT p+q+r

*/
public class Question13 {
    public static void main(String[] args) {
        int p,q,r;
        q=30;
        p=10;
        r=20;
        if(r>(r+p))
        {
            q=1;
        }
        else
        {
            if(r>(q+p))
            {
                q=(0^5);
            }
            else
            {
                p=p+2;
                r=p+2;
            }
        }
        System.out.println(p+q+r);
    }
}
