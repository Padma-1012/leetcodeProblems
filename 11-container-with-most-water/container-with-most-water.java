class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length-1, ma = 0;
        while(l<r){
            int cap = (r-l)*Math.min(height[l],height[r]);
            ma = Math.max(cap, ma);
            if(height[l]>height[r]) r--;
            else l++;
        }
        return ma;
    }
}