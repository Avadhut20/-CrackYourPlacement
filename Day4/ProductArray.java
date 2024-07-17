class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long[] output = new long[n];
        for (int i = 0; i < n; i++) {
            output[i] = 1;
        }

        // Step 2: Multiply all elements to the left of each element
        long leftProduct = 1;
        for (int i = 0; i < n; i++) {
            output[i] *= leftProduct;
            leftProduct *= nums[i];
        }

        // Step 3: Multiply all elements to the right of each element
        long rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return output;
    
	} 
} 
