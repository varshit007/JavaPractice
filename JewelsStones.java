import java.util.*;
class JewelsStones {
//     public int numJewelsInStones(String jewels, String stones) {
//       HashMap<Character, Integer> freq = new HashMap<>(); 
      
//       for (int i = 0; i < stones.length(); i++) {
//         char c = stones.charAt(i); 
//         if (!freq.containsKey(c)) {
//           freq.put(c,1); 
//         } else {
//           int new_val = freq.get(c) + 1; 
//           freq.replace(c,new_val); 
//         }
//       }
      
//       int count = 0; 
//       for (int i = 0; i < jewels.length(); i++) {
//         char c = jewels.charAt(i);
//         if (freq.containsKey(c)) {
//            count += freq.get(c);  
//         }
//       }
//       return count; 
//     }
      public int numJewelsInStones(String J, String S) {
        int res = 0;
        Set<Character> setJ = new HashSet<>();
        for (char j: J.toCharArray())
            setJ.add(j);
        for (char s: S.toCharArray())
            if (setJ.contains(s)) res++;
        return res;
    }
}