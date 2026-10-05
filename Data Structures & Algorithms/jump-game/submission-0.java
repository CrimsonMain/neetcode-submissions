class Solution {
    public boolean canJump(int[] nums) {
        int i = 0;
        int distance = 0;
        while(i < nums.length-1){
            if(nums[i] >= distance){
                distance = nums[i];
            }
            if(distance == 0){
                return false;
            }
            distance--;
            i++;
        }
        return true;
    }
}
