class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>h=new HashMap<>();
        int l=0,m=0;
        for(int i=0;i<s.length();i++){
            Character curr=s.charAt(i);
            if(h.containsKey(curr)&&h.get(curr)>=l){
                l = h.get(curr) + 1;
            }
            h.put(curr,i);
            m = Math.max(m, i - l + 1);
        }
        return m;
    }
}

-----------------------------------------------------------------------
itorial
Editorial
Solutions
Solutions
Submissions
Submissions


Code
Testcase
Testcase
Test Result
3. Longest Substring Without Repeating Characters

avatar
Discuss Approach
arrow-up
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
