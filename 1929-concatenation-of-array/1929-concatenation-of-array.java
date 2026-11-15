class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n * 2];
        int left = 0;
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                arr[left] = nums[j];
                left++;
            }
        }
        return arr;

    }
}