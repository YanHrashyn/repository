// https://leetcode.com/problems/max-consecutive-ones/description/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == 1){
                sum+=1;
            }
            else{
                max = Math.max(max,sum);
                sum = 0;
            }
        }
        return Math.max(max,sum);
    }
}
