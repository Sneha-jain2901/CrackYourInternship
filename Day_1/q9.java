// 974. Subarray Sums Divivsible by K
package Day_1;

import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int pre=0;
        int n=nums.length;
        HashMap<Integer,Integer> rem=new HashMap<>();
        rem.put(0,1);
        int i=0,count=0;
        while(i<n){
            pre+=nums[i];
            int mod=pre%k;
            if (mod < 0) {
                mod += k;
            }
            if(rem.containsKey(mod)){
                count+=rem.getOrDefault(mod,1);
                rem.put(mod,rem.get(mod)+1);
                System.out.println(pre+" "+count);
            }else{
                rem.put(mod,1);
            }
            i++;
        }
        return count;
    }
}
