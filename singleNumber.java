import java.util.*;
class singleNumber {
    public int singleNum(int[] nums) {
        
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>(); 
        
        for (int i = 0; i < nums.length; ++i){
            int value = 1;
            if (! (h.containsKey(nums[i]) )) {
                h.put(nums[i], value); 
            }else if (h.containsKey(nums[i])) {
                int val = h.get(nums[i]) + 1; 
                h.replace(nums[i], val); 
            }
                
        }
        
        for (int i : nums) {
             if (h.get(i) == 1) {
                return i;
            }
    }
    return 0;
        
    }       
        
}