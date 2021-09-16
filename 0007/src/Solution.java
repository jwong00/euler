import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.findPrime(3));
        System.out.println(s.findPrime(4));
        System.out.println(s.findPrime(5));
        System.out.println(s.findPrime(6));
        System.out.println(s.findPrime(10_001));

    }

    //returns the nth prime
    public int findPrime(int n) {
        boolean[] isComposite = sieve(Integer.MAX_VALUE-20);

        int c=2,p=0;

        while(p<n) {
            if(!isComposite[c]) p++;
            c++;
        }

        return c-1;
    }


    //create and return a sieve of i..max
    public boolean[] sieve(int max) {
        boolean[] sieve = new boolean[max+1];

        for(int i=2;i*i<=max;i++) {
            if(!sieve[i]) for(int j=2*i;j<=max && j>=0;j+=i) {
                sieve[j] = true;
            }
        }

        return sieve;
    }
}
