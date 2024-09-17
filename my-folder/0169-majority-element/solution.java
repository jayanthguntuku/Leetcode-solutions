class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
        for(Map.Entry<Integer, Integer> e : hm.entrySet()){
            if(e.getValue() > nums.length/2){
                return e.getKey();
            }
        }
        return 0;
    }
}
