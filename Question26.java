/*
What will be the value of evenCounter if number = 2630 in the following pseudocode
Real number
Function divisible(number)
evenCounter=0,num_remainder=number
while(num_remainder)
digit=num_remainder%10
if(digit !=0 AND number%digit==0)
evenCounter=evenCounter+1
end if
num_remainder=num_remainder/10
end while
return evenCounter
 */
public class Question26 {
    public static int divisible(int number){
        int evenCounter=0,num_remainder=number;
        while(num_remainder>0) {
           int digit = num_remainder % 10;
            if (digit != 0 && number%digit == 0)
            evenCounter = evenCounter + 1;
            num_remainder = num_remainder / 10;
        }
        return evenCounter;
    }

    public static void main(String[] args) {
        System.out.println(divisible(2630));
    }
}
