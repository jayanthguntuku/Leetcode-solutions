class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int i = 0;
        for (int[] ar : queries){
            int res = 0;
            int index1 = ar[0];
            int index2 = ar[1];

            for(int j = index1; j <= index2; j++){
                res = res ^ arr[j];
            }
            answer[i] = res;
            i++;
        }

        return answer;
    }
}
