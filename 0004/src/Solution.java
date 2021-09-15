import java.util.Arrays;

public class Solution {

    public static final int V_MAX = 999*999;
    public static final int L_MAX = 6;

    public static void main(String[] args) {

        int max = 0;
        for(int i=999;i>900;i--) {
            for(int j=999;j>900;j--) {
                if(isPalindromic(i*j)) {
                    System.out.println(""+i+"*"+j+"="+(i*j)+" is palindromic");
                    max = Math.max(max,i*j);
                }
            }
        }

        System.out.println(max);
    }

    public static boolean isPalindromic(int num) {
        int[] digits = new int[L_MAX];
        int i=0;
        while(num>0) {
            digits[i++]=num%10;
            num/=10;
        }

        int l=0,r=i-1;

        while(l<=r) {
            if(digits[l]!=digits[r]) return false;
            l++;
            r--;
        }

        return true;
    }
}
