class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 1, r = n-2;
        int sum = 0;
        int lm = height[0], rm = height[n-1];
        while(l<=r){
            if(lm<rm){
                if(height[l]<lm){
                    sum+=lm-height[l];
                    l++;
                }
                else{
                    lm = height[l];
                    l++;
                }
            }
            else{
                if(height[r]<rm){
                    sum+= rm-height[r];
                    r--;
                }
                else{
                    rm = height[r];
                    r--;
                }
            }
        }
        return sum;
    }
}