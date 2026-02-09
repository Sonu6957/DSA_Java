/* Problem :- 
    The Fibonacci numbers, commonly denoted F(n) form a sequence, 
    called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1.
    
    Approach :- Recursion
    Time :- O(log n)
    Space :-  O(log n)

*/
public class fibonacci {
    public static void main(String[] args) {
       System.out.println(fibonacciUpton(6));
        
    }
    static int fibonacciUpton(int n){
        if(n <=1){
            return n;
        }
        else{
            return n + fibonacciUpton(n-1);
        }
    }

}
