// 442. Find all duplicates in an array
package Day_1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n=Math.abs(nums[i]);
            int id=n-1;
            if(nums[id]<0){
                ans.add(n);
            }
            nums[id]*=-1;
        }
        return ans;
    }
}
