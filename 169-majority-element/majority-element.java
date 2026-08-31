class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;
        for(int i = 0; i<nums.length; i++){
            if(count ==0){
                candidate = nums[i];
            }
            if(candidate == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int f = 0;
        for(int i = 0; i<nums.length; i++){
            if(candidate == nums[i]){
                f++;
            }
        }
        return f>nums.length/2?candidate:-1;
    }
}