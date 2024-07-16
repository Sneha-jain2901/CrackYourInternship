//sort colors
package Day_1;

class Solution {
    void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        int first=0,last=n-1,i=0;
        while (i <= last) {
            if (nums[i] == 0) {
                swap(nums, first++, i++);
            } else if (nums[i] == 2) {
                swap(nums, last--, i);
            } else {
                i++;
            }
        }
    }
}
