class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        ArrayList<String> res = new ArrayList<String>();
        HashMap<String, Integer> hm1 = new HashMap<>();

        for(String i:words1){
            if(hm1.containsKey(i)){
                hm1.put(i, hm1.get(i) + 1);
            }
            else{
                hm1.put(i,1);
            }
        }
        for(String i:words2){
            if(hm1.containsKey(i)){
                hm1.put(i, hm1.get(i) + 1);
            }
            else{
                hm1.put(i,1);
            }
        }

        for(Map.Entry<String, Integer> e : hm1.entrySet()){
            if(e.getValue() == 1){
                res.add(e.getKey());
            }
        }

        String[] ans = new String[res.size()];
        return res.toArray(ans);


    }
}
