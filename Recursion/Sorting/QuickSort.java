/* Problem :- 
    Sort the array using quick sort in recursion.
    
    Approach :- Recursion
    Time :- O(Nlogn)
    Space :-  O(Nlogn)

*/
package Sorting;
import java.util.*;
public class QuickSort{
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,2,1};
        QuicksortInplace(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
    static void QuicksortInplace(int[] arr, int low, int high) {

        int s = low;
        int e = high;
        int p = s+(e - s) /2;
        if (low >= high) {
            return;
        }
        while (s <= e) {
            while (arr[s] < arr[p]) {
                s++;
            }
            while (arr[e] > arr[p]) {
                e--;
            }

            if (s<=e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        QuicksortInplace(arr, low, e);
        QuicksortInplace(arr, s, high);
    }
}