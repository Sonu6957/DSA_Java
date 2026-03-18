package OOPS.ExamplesOfOops.ExceptionHandling;

//Example for handling exception in java. Here, dividing a number by zero.

public class ExceptionHandling {

    public static void main(String[] args){
        int a = 3;
        int b = 0;
        try {
           divide(a, b); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            int res = a+b;
            System.out.println(res);
            
            System.out.println("This will always run");
        }
        
        
    }
    static int divide(int a, int b) throws Exception{
            if(b == 0){
                throw new Exception("Do not divide by zero");
            }
            else{
                return a/b;
            }
        }

}
