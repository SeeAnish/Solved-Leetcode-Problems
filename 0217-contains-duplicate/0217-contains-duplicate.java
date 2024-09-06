class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet<>(nums.length);
        for(int i: nums)
            if(!set.add(i)) return true;
        return false;
        
    }
}

//Time Complexity: O(n)
//Space Complexity:O(1)