/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int first = 1;
        int last = n;
        while(first < last) {
            int mid = (first + last) >>> 1;
            if(isBadVersion(mid)) {
                last = mid;
            }
            else {
                first = mid + 1;
            }
        }
        return first;
    }
}