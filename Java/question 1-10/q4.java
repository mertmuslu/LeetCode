class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i,j,k;
        i = j = k = 0;
        int total = nums1.length+nums2.length;
        int[] merged = new int[total];
        while(i<nums1.length && j<nums2.length) {
            if ((nums1[i] < nums2[j])) {
                merged[k] = nums1[i];
                i++;
                k++;
            }
            else {
                merged[k] = nums2[j];
                j++;
                k++;
            }  
        }
    
    if(i!=nums1.length){
        while(i<nums1.length) {
            merged[k] = nums1[i];
            i++;
            k++;
        }
    }
    else if(j!=nums2.length) {
        while(j<nums2.length) {
            merged[k] = nums2[j];
            j++;
            k++;
        }    
    }
    for(int z = 0; z<total;z++) {
        System.out.println(merged[z] + " ");
    }
    
    if(total%2 == 1) return (double)merged[total/2];
    else return (double)(merged[total/2-1] + merged[total/2])/2;
    }
}