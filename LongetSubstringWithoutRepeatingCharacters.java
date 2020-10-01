// Given a string s, find the length of the longest substring without repeating characters.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int aPointer= 0, bPointer = 0, max = 0;
        
        HashSet<Character> set = new HashSet();
        
        while(bPointer < s.length())
        {
            if(!set.contains(s.charAt(bPointer))){
                set.add(s.charAt(bPointer));
                bPointer++;
                max= Math.max(set.size(), max);
            }
            
            else {
                set.remove(s.charAt(aPointer));
                aPointer++;
            }
        }
        
        return max;
        

    }        
    }
