class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int ans = -1;
        int len = 0;
        for(int i:nums){
            max = Math.max(i, max);
        }
        for(int i:nums){
            if(i == max){
                len++;
            }else{
                len = 0;
            }
            ans = Math.max(len, ans);
        }
    return ans;
    }
}
