public class Solution {
    public static void main(String[] args) {
        long VALUE = 600851475143L;

        int root  = (int) Math.sqrt(VALUE);

        boolean[] sieve = new boolean[Integer.MAX_VALUE-5];

        System.out.println(root);

        System.out.println(root<Integer.MAX_VALUE-5);

        for(int i=2;i<=root;i++) {
            if(!sieve[i]) for(int j=2*i;j<=Integer.MAX_VALUE-6 && j>0;j+=i) {
                sieve[j]=true;
            }
        }

        int lpf = 0;
        for(int r = Integer.MAX_VALUE-6;r>1;r--) {
            if(!sieve[r] && VALUE%r == 0) {
                lpf=r;
                break;
            }
        }

        System.out.println("LPF of "+VALUE+" is "+lpf);

    }
}
