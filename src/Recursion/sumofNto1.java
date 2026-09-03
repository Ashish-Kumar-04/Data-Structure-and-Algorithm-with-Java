package Recursion;

public class sumofNto1 {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int ans=sum(n);
        System.out.println("Sum of the numbers "+n+" to "+" 1 is "+ans);
    }
}
