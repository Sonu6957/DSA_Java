package Medium_Problems;

public class TargetSum {
    public static void main(String[] args) {
        int[] nums= new int[]{1,1,1,1,1};
        targetSumProblem(nums, 3);
    }
    static void targetSumProblem(int[]nums,int target){
        
        int ans = targetSumsearch(nums,0, target,0);
            
        System.out.println(ans);
    }
    static int targetSumsearch(int[] nums,int counter,int target,int sum){
        if(counter>=nums.length){
            if(sum==target){
                return 1;
            }
            else{
                return 0;
            }
        }
        
        int left = targetSumsearch(nums, counter+1, target, sum+nums[counter]);
        int right = targetSumsearch(nums, counter+1, target, sum-nums[counter]);
        
        return left + right;
        
    

    }
    
}
