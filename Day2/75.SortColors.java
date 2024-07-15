package Day2;

class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=0;
        while(i<=j){
            if(nums[i]==0){
                swap(nums,i,k);
                i++;
                k++;
            }
            else if(nums[i]==1){
              
                i++;
            }
            else{
                swap(nums,i,j);
                
                j--;
            }
        }
    }
    public static void swap(int arr[],int first, int last){
        int temp = arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
        
    }
}