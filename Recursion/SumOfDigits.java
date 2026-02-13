/* Problem :- 
    Given a number, we need to find sum of its digits using recursion.
    Approach :- Recursion
    Time :- O(n)
    Space :-  O(n)

*/
public class SumOfDigits{
    public static void main(String[] args) {
        System.out.println(sumOfDigit(4242));
    }
    static int sumOfDigit(int n){
        if(n==0){
            return n;
        }
        
        return (n%10) + sumOfDigit(n/10);
    }
}