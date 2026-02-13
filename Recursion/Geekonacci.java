/* Problem :- 
    Geek created a random series and given a name geek-onacci series. 
    Given four integers A, B, C, N. A, B, C represents the first three numbers of geek-onacci series. Find the Nth number of the series. The nth number of geek-onacci series is a sum of the last three numbers (summation of N-1th, N-2th, and N-3th geek-onacci numbers)
    Approach :- Recursion
    Time :- O(n)
    Space :-  O(n)

*/
public class Geekonacci{
    public static void main(String[] args) {
        System.out.println(geekonacciSeries(6));
    }
    static int geekonacciSeries(int n){
        if(n==3){
            return 2;
        }
        if(n==2){
            return 3;
        }
        if(n==1){
            return 1;
        }
        return geekonacciSeries(n-1)+geekonacciSeries(n-2)+geekonacciSeries(n-3);
    }
}