class Result {

    public static long repeatedString(String s, long n) {
        long fullRepeats = n / s.length();      // how many full copies of s
        int remainder = (int) (n % s.length()); // leftover chars

        long countInS = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') countInS++;
        }

        long total = countInS * fullRepeats; // 'a's from full repeats

        // count 'a's in the first 'remainder' characters
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') total++;
        }

        return total;
    }
}
-------------------------------------------------------------------------

Problem Statement

Given a string s and a number n, consider an infinite repetition of the string s. Determine how many times the character 'a' appears in the first n characters of this infinitely repeated string.

Example:
Input:

s = "aba"
n = 10


Output:

7
--------------------------------------------------------------------------
Algorithm

Read the input string s and number n.

Count the number of 'a' characters in the string s → call this countInS.

Compute how many full times the string s repeats in the first n characters:

fullRepeats = n / |s|
remainder   = n % |s|


Total 'a' count =

total = countInS * fullRepeats


Add the number of 'a's in the first remainder characters of s.

Return total.



----------------------------------
