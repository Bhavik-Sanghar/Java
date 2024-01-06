class Solution {
public int lengthOfLongestSubstring(String s) {
    // Initialize variables if needed
    int max = 0;
    int count = 0;

    // Loop through the string and implement your solution
    for (int i = 0; i < s.length(); i++) {
        for (int j = i; j < s.length(); j++) {
            if (s.substring(i, j).indexOf(s.charAt(j)) == -1) {
                count++;
                max = Math.max(max, count);
            } else {
                break;
            }
        }
        count = 0;  // Reset count for the next substring
    }

    // Return the result
    return max;
}


    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb")); // Expected output: 3
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));    // Expected output: 1
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));   // Expected output: 3
    }
}
