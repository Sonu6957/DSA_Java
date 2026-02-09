package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
       int[] arr = new int[]{2,5,3,7,1};
        System.out.println(Arrays.toString(selectionSortRec(arr,arr.length-1,0,arr[0]))); 
    }
    static int[] selectionSortRec(int[] arr, int traverselength,int currentIndex,int max){
        if(traverselength  == 0){
            return arr;
        }
        if(currentIndex<traverselength){
            if(max <= arr[currentIndex]){
                max = arr[currentIndex];
            }
            return selectionSortRec(arr, traverselength, currentIndex+1,max);
        }
        else{
            arr[traverselength]=max;
            max = arr[0];
           return selectionSortRec(arr, traverselength -1 , 0,max);
           
        }
    }
}
