
import java.util.ArrayList;


/* Problem :- 
    Given a array of characters(String), return the permutation of the string.
    Approach :- Recursion
    Time :- O(n.n!)
    Space :-  O(n.n!)

*/


public class Permutation{
    public static void main(String[] args) {
        ArrayList<String> res = new ArrayList<>();
        String str = "abcd";
        int count = permutationOfString("",str,res);
        System.out.println(res);
        System.out.println(count);
    }
    static int permutationOfString(String p, String up, ArrayList<String> result){
        if(up.isEmpty()){
            result.add(p);
            return 1;
        }   
        char firstchar = up.charAt(0);
        int count = 0;
        for(int i = 0;i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            count+= permutationOfString(first+firstchar+second, up.substring(1),result);
        }
        return count;
    }
}