class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int count = 0;
        int max = 0;

        while (right < s.length()) {

            boolean duplicate = false;

            for (int i = left; i < right; i++) {
                if (s.charAt(i) == s.charAt(right)) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                left++;
            } else {
                count = right - left + 1;
                max = Math.max(max, count);
                right++;
            }
        }

        return max;
    }
}