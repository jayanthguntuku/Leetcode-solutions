class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet <Character> hs = new HashSet<>();
        //HashSet <String> hs2 = new HashSet<>();

        for(char ch: allowed.toCharArray()){
            hs.add(ch);
        }

        int count =0;
        boolean flag;

        for(String word : words){
            flag = true;
            for(char ch2: word.toCharArray()){
                if(!hs.contains(ch2)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }

    return count;
    }
}
