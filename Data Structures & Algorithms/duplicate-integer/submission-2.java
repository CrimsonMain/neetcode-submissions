class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> duplicate = new HashSet<Integer>();
        for(int i : nums){
            duplicate.add(i);
        }
        if (duplicate.size()==nums.length){
            return false;
        }
            return true;
    }
}