/* Problem :- 
    Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

    A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
    
    Approach :- Recursion
    Time :- O(4*n)
    Space :-  O(n)

*/
import java.util.*;
public class LetterCombination{
    public static void main(){
        ArrayList<String> res = new ArrayList<>();
        combination("", "29",res);
        System.out.println(res);
    }
    static void combination(String p, String up, ArrayList<String> result){
        if(up.isEmpty()){
            result.add(p);
            return;
        }
        
        int firstNumber = Integer.parseInt(String.valueOf(up.charAt(0)));
        //int firstNumber = (int)up.charAt(0);
        int start = (firstNumber-2)*3;
        int end = start + 3;
        if(firstNumber == 7){
            end = start + 4;
        }
        for(int i = start ;i<end;i++){
           char firstchar =(char)('a' + i);
           combination(p+firstchar, up.substring(1),result);
        }
    }
}