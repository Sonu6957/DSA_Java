/* Problem :- 
    The Fibonacci numbers, commonly denoted F(n) form a sequence, 
    called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1.
    
    Approach :- Recursion
    Time :- O(n)
    Space :-  O(n)

*/
public class fibonacci {
    public static void main(String[] args) {
       System.out.println(fibonacciUpton(2));
        
    }
    static int fibonacciUpton(int n){
        if(n==0 || n==1){
            return n;
        }
        else{
            return fibonacciUpton(n-1) + fibonacciUpton(n-2);
        }
    }

}
