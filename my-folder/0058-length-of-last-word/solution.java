class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        int len = words.length;
        String lw = words[len - 1];

        return lw.length();
    }
}
