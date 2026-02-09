/* Problem :- 
    Sort the array using bubble sort in recursion.
    
    Approach :- Recursion
    Time :- O(n)
    Space :-  O(n)

*/
package Sorting;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,3,7,1};
        System.out.println(Arrays.toString(bubbleSortRec(arr,0,arr.length-1)));
        System.out.println(Arrays.toString(bubbleSortRec2(arr,arr.length-1,0)));
    }
// Method -1 
    static int[] bubbleSortRec(int[] arr, int startindex,int endindex){
        if(endindex==0){
            return arr;
        }
        if(startindex == arr.length-1){
            return bubbleSortRec(arr, 0,endindex-1);
        }
        else if(arr[startindex]>arr[startindex+1]){
            int temp = arr[startindex];
            arr[startindex]=arr[startindex+1];
            arr[startindex+1]=temp; 
            return bubbleSortRec(arr, startindex+1,endindex);   
        }
        else{
            return bubbleSortRec(arr,startindex+1,endindex);
        }
        
    }
//Method -2 
    static int[] bubbleSortRec2(int[] arr, int traverselength,int currentIndex){
        if(traverselength  == 0){
            return arr;
        }
        if(currentIndex<traverselength){
            if(arr[currentIndex]>arr[currentIndex + 1]){
                //swap
                int temp = arr[currentIndex];
                arr[currentIndex]=arr[currentIndex+1];
                arr[currentIndex+1]=temp;
            }
            return bubbleSortRec2(arr, traverselength, currentIndex+1);
        }
        else{
           return bubbleSortRec2(arr, traverselength -1 , 0);
        }
    }

}
