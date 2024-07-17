import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n= nums2.length;
        int [] ans = new int[nums1.length];
        Stack<Integer> st= new Stack<>();
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],-1);
        }
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                map.put(st.peek(),nums2[i]);
                st.pop();
            }
            st.push(nums2[i]);
        }
        int [] ans2= new int[nums1.length];
        int j=0;
        for(int i:nums1){
            ans2[j]=map.getOrDefault(i,-1);
            j++;
        }
        return ans2;
    }
}