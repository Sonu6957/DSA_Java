/* Problem :- 
    Given an integer num, return the number of steps to reduce it to zero. 
    In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
    
    Approach :- Recursion
    Time :- O(log n)
    Space :- O(log n)
*/
public class Reduce_No{
    public static void main(String[] args){
        reduce_no(123);
    }
    static void reduce_no(int n){
        int count = 0;
        System.out.println(helper(n, count));
    }
    static int helper(int n, int count){
        if(n == 0){
            return count;
        }
        if(n % 2 == 0){
            return helper(n/2,count+1);
        }
        else{
            return helper(n-1,count+1);
        }

    }
}