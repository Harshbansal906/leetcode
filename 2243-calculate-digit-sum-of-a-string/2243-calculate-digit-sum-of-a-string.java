
class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {

            int sum = 0;
            int left = 0;
            String str = "";

            for (int i = 0; i < s.length(); i++) {

                sum += s.charAt(i) - '0';
                left++;

                if (left == k || i == s.length() - 1) {
                    str += Integer.toString(sum);
                    sum = 0;
                    left = 0;
                }
            }

            s = str;
        }

        return s;
    }
}
