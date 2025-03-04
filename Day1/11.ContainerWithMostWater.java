class Solution{
    public int maxArea(int[] height) {
        int left=0;
        int right= height.length-1;
        int max=0;
        while(left<=right){
            int curr= Math.min(height[right],height[left])*(right-left);
            max= Math.max(max,curr);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return max;
    }
}