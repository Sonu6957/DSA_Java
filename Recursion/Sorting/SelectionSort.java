/* Problem :- 
    Sort the array using Selection Sort in recursion.
    
    Approach :- Recursion
    Time :- O(n)
    Space :-  O(n)

*/
package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
       int[] arr = new int[]{2,5,3,7,1};
        System.out.println(Arrays.toString(selectionSortRec(arr,arr.length-1,0,0))); 
    }
    static int[] selectionSortRec(int[] arr, int traverselength,int currentIndex,int maxIndex){
        if(traverselength  == 0){
            return arr;
        }
        if(currentIndex<=traverselength){
            if(arr[maxIndex] < arr[currentIndex]){
                maxIndex = currentIndex;
            }
            return selectionSortRec(arr, traverselength, currentIndex+1,maxIndex);
        }
        else{
            int temp = arr[maxIndex];
            arr[maxIndex]=arr[traverselength];
            arr[traverselength]=temp;
            
           return selectionSortRec(arr, traverselength-1 , 0,0);
           
        }
    }
}
