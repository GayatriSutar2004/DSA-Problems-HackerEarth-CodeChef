

class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;

        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }

            while(l<r && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }

            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))  ){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}
----------------------------------------------------------------------------------------------------
Step 1: Understand the Problem

We need to check if a string is a palindrome:

Ignore cases (treat uppercase = lowercase).

Ignore all non-alphanumeric characters (punctuation, spaces, etc).

Palindrome means: reads the same forward and backward.

✅ Example:
"A man, a plan, a canal: Panama" → "amanaplanacanalpanama" → Palindrome → true.

🔹 Step 2: Break into Subproblems

Filter the string → Keep only letters & numbers.

Normalize case → Convert everything to lowercase.

Check palindrome:

Compare first and last character, move inward (two-pointer method).

🔹 Step 3: Plan Solutions
Approach A: Using Extra String

Build a new cleaned string:

Use regex or loop to keep only Character.isLetterOrDigit(c).

Convert to lowercase.

Reverse the cleaned string.

Compare original cleaned string with reversed one.
👉 Easier to write, but uses O(n) extra space.

Approach B: Two Pointers (Efficient ✅)

Set left = 0, right = s.length() - 1.

While left < right:

Move left forward until it’s alphanumeric.

Move right backward until it’s alphanumeric.

Compare s.charAt(left) and s.charAt(right) (in lowercase).

If mismatch → return false.

Else move both pointers inward.

If all checks pass → return true.
👉 Space O(1), Time O(n).

🔹 Step 4: Implement (Java – Two Pointers)
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // skip non-alphanumeric chars
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // compare ignoring case
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car")); // false
        System.out.println(isPalindrome(" ")); // true
    }
}

🔹 Step 5: Dry Run Example

s = "A man, a plan, a canal: Panama"

left=0 → 'A' → lowercase 'a'

right=29 → 'a' → lowercase 'a' → match ✅

Move inward … keeps matching … until left crosses right → return true.

🔹 Step 6: Complexity

Time: O(n) → one pass over string.

Space: O(1) → no extra storage.
-----------------------------------------------------------------------------------------------------
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
