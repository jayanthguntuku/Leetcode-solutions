class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();
        String[] sNums = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            sNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(sNums, (a,b)-> (b+a).compareTo(a+b));

        if(sNums[0].equals("0")){
            return "0";
        }

        for(int i = 0; i < sNums.length; i++){
            sb.append(sNums[i]);
        }
         return sb.toString();
    }
}
