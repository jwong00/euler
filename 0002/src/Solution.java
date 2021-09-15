public class Solution {
    public static void main(String[] args) {

        int LIMIT = 4_000_000;
//        int LIMIT = 90;
        int a=1,b=2,c=0,s=2;

        while(a+b < LIMIT) {
            c=a+b;
            a=b;
            b=c;
            if(c%2==0) s+=c;
            System.out.println(c+" "+s);
        }

        System.out.println(s);
    }
}
