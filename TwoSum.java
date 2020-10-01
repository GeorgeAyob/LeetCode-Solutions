//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

class Solution {
public int[] twoSum(int[] nums, int target) {
    
    Map<Integer, Integer> map = new HashMap<>();
    
    for( int i = 0; i <nums.length ; i++){
        map.put(nums[i], i);
    }
    
    for( int i = 0; i <nums.length ; i++){
        if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i)
            return new int[] {i,map.get(target - nums[i])};
    }
    
    throw new IllegalArgumentException(" no pairs of two sums exist");
    
}
}


