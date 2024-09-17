class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()){
            return -1;
        }

        for(int i = 0; i < haystack.length(); i++){
            int cnt = 0;
            int idx = i;
            for(int j = 0; j < needle.length(); j++){
                if(idx < haystack.length() && haystack.charAt(idx) == needle.charAt(j)){
                    cnt++;
                    idx++;
                }
            }
            if(cnt == needle.length()){
                return i;
            }
        }
        return -1;
    }
}
