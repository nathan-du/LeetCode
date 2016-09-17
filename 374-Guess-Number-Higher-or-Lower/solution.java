/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long first = 1;
        long last = n;
        int mid = 0;
        while(first <= last) {
            mid = (int)((first + last)/2);
            int judge = guess(mid);
            if(judge == 0) break;
            else if(judge == -1) last = mid - 1;
            else if(judge == 1) first = mid + 1;
        }
        return mid;
    }
}