/* Problem :- 
    Find all the indexes of the target element in the given array
    
    Approach :- Recursion
    Time :- O(n)
    Space :-  O(n)

*/

package Arrays;
import java.util.*;

public class find_target {
 public static void main(String[] args) {
     System.out.println(findTargetInArray(new int[]{2,3,4,4,4,5,6}, 4, 0, new ArrayList<>()));
 }
 static ArrayList<Integer> findTargetInArray(int[] array,int target,int index, ArrayList<Integer> list){
    if(index == array.length){
        return list;
    }
    else{
        if(array[index]==target){
            list.add(index);
        }
        return findTargetInArray(array, target, index+1, list);
    }

 }
}
