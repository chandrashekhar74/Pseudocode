/*

Integer pp,qq,rr
Set pp=2,qq=9,rr=5
pp=(pp&rr)+pp
rr=rr+rr
rr(rr+rr)&rr
print pp+qq+rr

*/
import java.util.*;
public class Operator {
    public static void main(String[] args) {
        int pp,qq,rr;
        pp=2;
        qq=9;
        rr=5;
        pp=(pp&rr)+pp;
        rr=rr+rr;
        rr=(rr+rr)&rr;
        System.out.println(pp+qq+rr);
    }
}
