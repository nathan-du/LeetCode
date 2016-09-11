/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int first = 0;
        int last = n;
        while(true) {
            if(isBadVersion((first + last)/2)) {
                if(!isBadVersion((first + last)/2 - 1)) return n;
                last = (first + last)/2;
            }
            else {
                first = (first + last)/2;
            }
        }
    }
}