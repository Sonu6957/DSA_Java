package LinkedList.Questions;

// A happy number is a number defined by the following process:

// Starting with any positive integer, replace the number by the sum of the squares of its digits.
// Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// Those numbers for which this process ends in 1 are happy.
// Return true if n is a happy number, and false if not.

public class HappyNumber {

    public static void main(String[] args) {
        
        System.out.println(happyNumber(2));

    }
    public static boolean happyNumber(int n){
        int slow = n;
        int fast = n;
        do { 
            slow = calculateSumOfSquares(slow);
            fast = calculateSumOfSquares(calculateSumOfSquares(fast));
            
        } while (fast!=slow);
        if(fast == 1){
                return true;
            }
        return false;

    }
    public HappyNumber(){
        System.out.println("new num");
    }
    public static int calculateSumOfSquares(int n){
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans+=rem*rem;
            n = n/10;
        }
        return ans;
    }
}
