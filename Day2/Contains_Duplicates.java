import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> b=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(b.contains(nums[i])){
                return true;

            }
            b.add(nums[i]);
        }
        return false;
    }
}
