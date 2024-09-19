class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<Integer>();

        for(int i =0; i < expression.length(); i++){
            char c = expression.charAt(i);
            if(c == '+' || c == '*' || c == '-' ){
                String lh = expression.substring(0,i);
                String rh = expression.substring(i+1);

                List<Integer> lh_res = diffWaysToCompute(lh);
                List<Integer> rh_res = diffWaysToCompute(rh);

                for(int j : lh_res){
                    for(int k : rh_res){
                        if(c == '-'){
                            res.add(j - k);
                        }else if(c == '+'){
                            res.add(j + k);
                        }
                        else if(c == '*'){
                            res.add(j * k);
                        }
                    }
                }

            }

        }
        if(res.size() == 0){
            res.add(Integer.valueOf(expression));
        }
        return res;
    }
}
