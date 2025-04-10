// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class subarray {
    public int subarraySum(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int rSum = 0; int count =0;
        map.put(0,1);
        for(int i = 0 ; i < nums.length; i++){
            rSum += nums[i];
            if(map.containsKey(rSum-k)){
                count+=map.get(rSum-k);
            }
            map.put(rSum,map.getOrDefault(rSum,0)+1);
        }
        return count;
        
    }
}
