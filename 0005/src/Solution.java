public class Solution {
    public int LCM_RANGE(int lower,int upper) {
        //we'll need a 2D table to store the prime factors
    }


    //create and return a sieve of i..max
    public boolean[] sieve(int max) {
        boolean[] sieve = new boolean[max+1];

        for(int i=2;i*i<=max;i++) {
            if(!sieve[i]) for(int j=2*i;j<=max;j++) {
                sieve[j] = true;
            }
        }

        return sieve;
    }
}
