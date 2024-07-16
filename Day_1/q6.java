// Chocolae distribution problem
package Day_1;

import java.util.ArrayList;
import java.util.Collections;

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int s=0,l=m-1;
        long ans=a.get(l)-a.get(s);
        while(l<n){
            ans=Math.min(ans,a.get(l)-a.get(s));
            l++;
            s++;
        }
        return ans;
    }
}
