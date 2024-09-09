class Solution {
    public int missingNumber(int[] nums) {
        HashSet <Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length + 1; i++){
            hs.add(i);
        }
        for(int i:nums){
            hs.remove(i);
        }
        return hs.iterator().next();
    }
}
