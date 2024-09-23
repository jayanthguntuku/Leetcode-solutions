class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int[] dp=new int[s.length()+1];
        Set<String> dict=new HashSet<>(Arrays.asList(dictionary));
        for(int i=dp.length-2; i>=0; i--){
            int exclude=1 + dp[i+1];
            int include =Integer.MAX_VALUE;
            for(int j=i; j<s.length();j++){
                if(dict.contains(s.substring(i,j+1))){
                    include = Math.min(include,dp[j+1]);
                }
            }
            dp[i]=Math.min(include, exclude);
        }
        return dp[0];
    }
}
