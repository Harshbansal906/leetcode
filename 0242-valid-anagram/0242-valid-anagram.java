class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] arr = s.toCharArray();
        char[] pie = t.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(pie);
        return Arrays.equals(arr,pie);
    }
}