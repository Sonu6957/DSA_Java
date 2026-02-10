/* Problem :- 
    Sort the array using merge sort in recursion.
    
    Approach :- Recursion
    Time :- O(Nlogn)
    Space :-  O(Nlogn)

*/
package Sorting;
import java.util.*;

public class MergeSort {
    public static void main(String[] args){
        System.out.println(Arrays.toString(MergeSortArray(new int[]{2,5,4,3})));
    }
    static int[] MergeSortArray(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2 ;
        int[] left = MergeSortArray(Arrays.copyOfRange(arr, 0, mid));
        int[] right = MergeSortArray(Arrays.copyOfRange(arr, mid, arr.length));
        return Merge(left, right);
        

    }
    static int[] Merge(int[] first, int[] second){
        int[] resultArray = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                resultArray[k]=first[i];
                i++;
            }
            else{
                resultArray[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            resultArray[k]=first[i];
            k++;
            i++;
        }
        while(j<second.length){
            resultArray[k]=second[j];
            k++;
            j++;
        }
        return resultArray;
    }
}