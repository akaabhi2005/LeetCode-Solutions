class Solution {
    public int firstUniqChar(String s) {

        int[] count = new int[26];

        // Har character ki frequency count karo
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Pehla character jiska count 1 hai
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}