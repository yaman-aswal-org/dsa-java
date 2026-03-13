package strings;

public class StringsEasyQuestions {

    public static void main(String[] args) {

    }

    private static void validAnagram() {

    }

    /* Given a string s, find the length of the longest substring without duplicate characters.
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
    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring. */
    private static void longestSubstringWithoutRepeatingCharacters(String s) {

        int i = 0;
        int j = 1;
        int max = 0;
        int curr = 0;

        if (s.isEmpty()) {
            return;
        }

        max = 1;
        curr = 1;

        while (j < s.length()) {
            char chi = s.charAt(i);
            char chj = s.charAt(j);

            if (chi != chj) {
                curr = curr + 1;
            } else {
                i = j;

                if(curr >= max){
                    max = curr;
                }

                curr = 1;
            }
            j++;
        }

        System.out.println("Longest Substring Length: " + max);
    }

}
