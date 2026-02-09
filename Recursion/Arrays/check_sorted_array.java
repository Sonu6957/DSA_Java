/* Problem :- 
    Check if the array is sorted or Check if the array is in descending order.args
    
    Approach :- Recursion
    Time :- O(n)
    Space :-  O(n)

*/
package Arrays;
public class check_sorted_array {
    public static void main(String[] args){
        System.out.println(checkArrayIsSorted(new int[]{2,3,9,4,5},0));
    }
    static boolean checkArrayIsSorted(int[] array, int index){
        if(index == array.length-1){
            return true;
        }
        else{
            return (array[index] < array[index+1]) && (checkArrayIsSorted(array,index+1)); 
        }
    }
}
