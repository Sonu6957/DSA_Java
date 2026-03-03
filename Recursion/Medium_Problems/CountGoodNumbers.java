package Medium_Problems;

public class CountGoodNumbers {
    public static void main(String[] args) {
        System.out.println(startwithEach(4));
        //System.out.println(checkGoodNumberFunction(2000,3));
        
    }
    static int startwithEach(int n){
        int ans = 0;
        for(int i = (int)Math.pow(10, n-1);i<=(int)Math.pow(10, n)-1;i++){
            int temp = checkGoodNumberFunction(i,n-1);
            if(temp==1){
                System.out.println(i);
            }
            ans = ans + temp;
        }
        return ans;
    }
    static int checkGoodNumberFunction(int n,int counter){
        if(counter < 0){
            
            return 1;
        }
        int lastDigit = n%10;
        int left = 0;
        int right = 0;
        if(counter%2==0 && (lastDigit%2)==0){
            left = left + checkGoodNumberFunction(n/10, counter-1);
        }
        else if(counter%2!=0 && (isPrime(lastDigit))){
            
            right = right + checkGoodNumberFunction(n/10, counter-1);
        }
        else{
            return 0;
        }
        return left + right;
    }
    static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        if(n==0){
            return false;
        }
        for(int i =2;i<n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
