class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[]newarr= new int[nums1.length+ nums2.length];
        System.arraycopy(nums1, 0, newarr, 0, nums1.length);
        System.arraycopy(nums2, 0, newarr, nums1.length,nums2.length);
        Arrays.sort(newarr);
        if(newarr.length%2==0){

            double a = (newarr[(newarr.length)/2-1]);
            double b= (newarr[newarr.length/2]);
            return ((a+b)/2);

        }
        else

            return newarr[newarr.length/2];

    }
}