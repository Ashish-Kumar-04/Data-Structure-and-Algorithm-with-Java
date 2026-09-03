package Recursion;

public class sum {
    public static int sum_of_array(int []arr,int ind,int n,int sum){
       
        if(ind==n){
            return sum;
        }
        
        sum+=arr[ind++];
        return sum_of_array(arr, ind, n,sum);
    }
    public static void main(String[] args) {
        int nums[]={4,3,2,7,8};
        int n=5;
        int sum=0;
        System.out.println("sum of array is:- "+sum_of_array(nums,0,n,sum));
    }
}
