class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum = nums1.length + nums2.length;
        int[] res = new int[sum];
        int i = nums1.length - 1;
        int j = nums2.length - 1;
        int k = nums1.length + nums2.length - 1;
        int len = k;
        while (j>=0){
            if( i >= 0 && nums1[i] > nums2[j]){
                res[k] = nums1[i];
                i--;
                k--;
            }
            else{
                res[k] = nums2[j];
                j--;
                k--;
            }      
        }
        while(i >= 0){
            res[k] = nums1[i];
            i--;
            k--;
        }
        if(len % 2 == 1){
            return (double)(res[len/2] + res[(len/2)+1])/2;
        }else{
            return (double)res[len/2];
        }
    }
}
