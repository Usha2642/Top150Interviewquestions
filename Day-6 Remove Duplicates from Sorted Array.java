class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }else{
                i++;
                swap(nums,i,j);
                j++;
            }
        }
        return i+1;
    }
    static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
