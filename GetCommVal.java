/**Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.

Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.

 

Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4]
Output: 2
Explanation: The smallest element common to both arrays is 2, so we return 2.
Example 2:

Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
Output: 2
Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.
 

Constraints:

1 <= nums1.length, nums2.length <= 105
1 <= nums1[i], nums2[j] <= 109
Both nums1 and nums2 are sorted in non-decreasing order. */
class GetCommVal {
    public int getCommon(int[] nums1, int[] nums2) {
     /*does not handle all cases 32/40 test cases
     int n1 = nums1.length;
     int n2 = nums2.length;
     HashMap<Integer,Integer> hm = new HashMap<>();
     for(int i=0;i<n1;i++){
         hm.put(nums1[i],hm.getOrDefault(nums1[i],0)+1);
     }   
     int min = Integer.MAX_VALUE;
     for(int i=0;i<n2;i++){
        if(hm.containsKey(nums2[i])){
            // hm.put(nums2[i],hm.get(nums2[i]));
            if(hm.get(nums2[i])==1){
                min=Math.min(min,nums2[i]);
            }
        }
     }
         return min==Integer.MAX_VALUE?-1:min; */


     HashMap<Integer,Boolean> hm = new HashMap<>();
     for(int n:nums1){
         hm.put(n,true);
     }

     int min = Integer.MAX_VALUE;

     for(int n:nums2){
         if(hm.containsKey(n)){
             min=Math.min(n,min);
         }
     }
     return min==Integer.MAX_VALUE?-1:min;
    }
}