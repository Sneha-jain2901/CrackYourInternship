//283. Move Zeros
package Day_1;

class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int m=n,i=0;
        for(;i<n;i++){
            if(nums[i]==0){
                for(int j=i;j<n-1;j++){
                    nums[j]=nums[j+1];
                }
                n--;
                i--;
            }
        }
        for(;i<m;i++){
            nums[i]=0;
        }
    }
}
