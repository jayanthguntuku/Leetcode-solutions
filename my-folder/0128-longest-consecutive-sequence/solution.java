class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        HashMap <Integer, Boolean> hm =  new HashMap<>();
        for (int i: nums){
            hm.put(i,Boolean.FALSE);
        }
        for(int i : nums){
            int current = 1;
            int nextNum = i + 1;
            while(hm.containsKey(nextNum) && hm.get(nextNum) == false){
                current += 1;
                hm.put(nextNum, Boolean.TRUE);
                nextNum +=1;
            }

            int prevNum = i - 1;
            while(hm.containsKey(prevNum) && hm.get(prevNum) == false){
                current += 1;
                hm.put(prevNum, Boolean.TRUE);
                prevNum -=1;
            }
        res = Math.max(res, current);
        }
    return res;
    }
}
