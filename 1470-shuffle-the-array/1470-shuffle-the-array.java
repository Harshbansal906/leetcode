class Solution {
    public int[] shuffle(int[] nums, int n) {
        int k = nums.length;
        int[] arr = new int[2*n];
        int left = 0;
        int right = n;
        for(int i=0;i<k;i++){
            if(right<nums.length){
                arr[2*i]=nums[left];
                arr[2*i+1]=nums[right];
                left++;
                right++;
            }
            
        }
        return arr;
    }
}