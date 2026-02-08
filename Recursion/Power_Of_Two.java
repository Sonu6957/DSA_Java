/* Problem :- 
    Given an integer n, return true if it is a power of two. Otherwise, return false.
    An integer n is a power of two, if there exists an integer x such that n == 2^x.
    
    Approach :- Recursion
    Time :- 
    Space :- 
*/
public class Power_Of_Two {
    public static void main(String[] args){
        System.out.print(powerOfTwo(20,0));

    }
    static boolean powerOfTwo (int n,double power){
        if(Math.pow(2,power) > n ){
            return false;
        }
        else if(Math.pow(2,power) == n ){
                return true;
            }
        else{
           boolean res =  powerOfTwo(n, power+1);
           if(res == false){
            return false;
           }
           else{
            return true;
           }
        }
        
    }
}
