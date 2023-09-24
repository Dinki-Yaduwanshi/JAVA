class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int count=0;
     int left=0;

     int ans=0;
     for(int r=0;r<nums.length;r++){
     
     if(nums[r]!=1){
         count++;
     }
     
     while(count>1){
         if(nums[left]==0){
             count--;
         }
         left++;
     }
   
     ans= Integer.max(ans, r-left+1);
     }

     return ans; 
    }
}
