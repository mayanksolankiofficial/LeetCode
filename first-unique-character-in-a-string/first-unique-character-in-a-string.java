class Solution {
    public int firstUniqChar(String s) {
        
        int[] charCount = new int[26]; // assuminh only lowercase characters
        for(int i=0 ; i<s.length() ; i++)// 1st pass- counting occurences of characters 
        {
            charCount[s.charAt(i)-'a']++;
        }
        
        for(int i=0 ; i<s.length() ; i++) // 2nd pass- finding first non repeating
         {
             if(charCount[s.charAt(i)-'a']==1) return i;
         }
        return -1;
    }
}