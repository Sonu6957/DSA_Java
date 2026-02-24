import java.util.*;
public class CombinationSum {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
        int[] nums = {2,3,6,7};
        int target = 8;
        ArrayList<Integer> temp = new ArrayList<Integer>(); 
       combinationSumfunction(nums, temp, resultList, target,0);
       System.out.println(resultList);

        
    }
    static void combinationSumfunction(int[] nums,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> resultList,int target,int start){
        if(arrayListSum(temp)==target){
            resultList.add(new ArrayList<>(temp));
            
            return;
        }

        
        for(int i = start;i<nums.length;i++){
            
            temp.add(nums[i]);
            if(arrayListSum(temp)>target){
                temp.remove(temp.size() - 1);
                
            }
            else{
                combinationSumfunction(nums,temp,resultList,target,i);
                temp.remove(temp.size() - 1);
            }
        }
        
    }
    static int arrayListSum(ArrayList<Integer> arryList){
        int sum = 0;
        for(Integer d : arryList)
            sum += d;
        return sum;
    }
}
