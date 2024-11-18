/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/* The isBadVersion API is defined in the parent class VersionControl.
   boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2; // To avoid overflow
            if (isBadVersion(mid)) {
                right = mid; // Narrow down to the left part
            } else {
                left = mid + 1; // Narrow down to the right part
            }
        }

        // `left` will point to the first bad version
        return left;
    }
}
