/*

Integer p,q,r
Set p=5,q=2,r=5
for each r from 5 to 6
p=(r+7)+r
if((r+q)>(q-r)||8<q)
q=p+r+q
continue
End if
End for
Print p+q

*/
public class Question4 {
    public static void main(String[] args) {
        int p,q,r;
        p=5;
        q=2;
        r=5;
        for(r=5;r<=6;r++)
        {
            p=(r+7)+r;
            if((r+q)>(q-r)||8<q)
            {
                q = p + r + q;
                continue;
            }
        }
        System.out.println(p+q);
    }
}
