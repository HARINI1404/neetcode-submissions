class Solution {
    public int characterReplacement(String s, int k) {

        int[] count = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character to the window
            int index = s.charAt(right) - 'A';
            count[index]++;

            // Find the highest frequency character
            maxFreq = Math.max(maxFreq, count[index]);

            // Number of replacements needed
            int replacements = (right - left + 1) - maxFreq;

            // If more than k replacements are needed,
            // shrink the window
            while (replacements > k) {

                int leftIndex = s.charAt(left) - 'A';
                count[leftIndex]--;

                left++;

                replacements = (right - left + 1) - maxFreq;
            }

            // Update maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}