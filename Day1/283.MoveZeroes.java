class Solution {
    public void moveZeroes(int[] arr) {
        int i=0;
    
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                swap(arr,i,j);
                i++;
                
            }
        }
    }
    public void swap( int arr[], int f, int l){
        int temp = arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }
}