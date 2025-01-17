//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int [] result = new int[nums.length];
        
        if(nums==null|| nums.length == 0) return result;
        int rp =1;
        result[0] = 1;
        //left pass
        for(int i =1;i<nums.length;i++){
            rp*= nums[i-1];
            result[i] = rp;
        }

        rp = 1;
        //right pass
        for(int i =nums.length-2;i>=0;i--){
            rp*= nums[i+1];
            result[i] *= rp;
        }
        return result;

    }
}