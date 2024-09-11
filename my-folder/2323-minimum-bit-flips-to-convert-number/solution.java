class Solution {
    public int minBitFlips(int start, int goal) {
        int count= Integer.bitCount(start ^ goal);
        return count;
    }
}
