import java.util.*;
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<=n-m;i++){
            int diff=Math.abs(a.get(i)-a.get(i+m-1));
            minDiff= Math.min(diff,minDiff);
        }
        return minDiff;
    }
}