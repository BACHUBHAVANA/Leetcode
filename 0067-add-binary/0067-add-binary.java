public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Traverse both strings from the end
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            // Add the current digit of 'a' if available
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            // Add the current digit of 'b' if available
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Compute the resulting bit and update the carry
            result.append(sum % 2); // Append the result of sum mod 2 (either 0 or 1)
            carry = sum / 2;        // Update carry (0 or 1)
        }

        // Reverse the result to get the final binary sum
        return result.reverse().toString();
    }
}
