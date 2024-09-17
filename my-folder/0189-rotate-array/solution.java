class Solution {
    public void rotate(int[] nums, int k) {
        int index = nums.length - (k%nums.length);
        int[] res = new int[nums.length];
        res = nums.clone();
        for(int i = 0; i< res.length; i++){
            if(index < res.length){
                nums[i] = res[index];
                index++;
            }else{
                index = 0;
                nums[i] = res[index];
                index++;
            }
        }
    }
}
