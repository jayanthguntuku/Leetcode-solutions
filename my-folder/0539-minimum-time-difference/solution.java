class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int[] arr = new int[n];
        int min  = 50000;

        for(int i = 0; i < n; i++){
            String timeStamp = timePoints.get(i);
            arr[i] = (Integer.parseInt(timeStamp.split(":")[0])) * 60 + (Integer.parseInt(timeStamp.split(":")[1]));
        }
        Arrays.sort(arr);
        for(int i = 0; i < n-1; i++){
            min = Math.min(min, arr[i+1] - arr[i]);
        }
        min = Math.min(min, 24*60 - arr[n-1]+arr[0]);

        return min;
    }
}
