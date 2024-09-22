class Solution {
    public List<Integer> lexicalOrder(int n) {
        int var = 1;
        int temp = 2;
        List<Integer> list = new ArrayList<Integer>();
        for(int i =1; i<=n; i++){
            list.add(var);
            if(var*10<=n){
                var = var * 10;
            }
            else{
                while(var % 10 == 9 || var >= n){
                    var = var/10;
                }
                var+=1;
            }
        }
        
        return list;
    }
}
