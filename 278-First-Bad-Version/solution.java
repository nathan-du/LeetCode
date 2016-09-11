/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int first = 1;
        int last = n;
        while(first < last) {
            if(isBadVersion((first + last)/2)) {
                last = (first + last)/2;
            }
            else {
                first = (first + last)/2 + 1;
            }
        }
        return first;
    }
}