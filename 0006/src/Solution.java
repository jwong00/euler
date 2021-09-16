public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.sumSquareDiff(10));
        System.out.println(s.sumSquareDiff(100));
    }
    public int sumSquareDiff(int upper) {
        if(upper==0) return 0;

        int sumOfSquares = 0;
        int sum = 0;

        for(int i=1;i<=upper;i++) {
            sumOfSquares+=(i*i);
            sum+=i;
        }

        return sum*sum-sumOfSquares;
    }
}
