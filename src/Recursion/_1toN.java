package Recursion;

public class _1toN {
    public static void print(int n,int ind){
        if(ind>n){
            return;
        }
        System.out.println(ind);
        print(n,ind+1);
    }
    public static void main(String[] args) {
        int n=10;
        print(n,1);
    }
}
