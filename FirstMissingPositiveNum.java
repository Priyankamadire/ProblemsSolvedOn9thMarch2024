/**
 * 41. First Missing Positive
Solved
Hard
Topics
Companies
Hint
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

 

Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
 */
class FirstMissingPositiveNum {
    public int firstMissingPositive(int[] nums) {
        // HashSet<Integer> hs = new HashSet<>();
        // for(int n:nums){
        //     hs.add(n);
        // }
        // int mini = Integer.MAX_VALUE;
        // int n = nums.length;
        // for(int i=1;i<=n;i++){
        //     if(!hs.contains(i)){
        //         mini=Math.min(mini,i);
        //     }
        // }
        // return mini;
        int i=0;
        int n = nums.length;
        while(i<n){
            int c = nums[i]-1;
            if(nums[i]>0 && nums[i]<n && nums[i]!=nums[c]){
                int t = nums[i];
                nums[i]=nums[c];
                nums[c]=t;
            }
            else{
                i++;
            }
        }
            if(nums[0]!=1){
                return 1;
            }

            for(int j=0;j<n;j++){
                if(nums[j]!=j+1){
                    return j+1;
                }
            }
        
        return n+1;
    }
}