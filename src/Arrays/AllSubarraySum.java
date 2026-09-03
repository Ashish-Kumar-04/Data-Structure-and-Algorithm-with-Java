package Arrays;

public class AllSubarraySum {
    public static void main(String[] args) {
        int arr[]={3,5,2,1,7};
        int i,j;
        int n=arr.length;
        for(i=0;i<=n-1;i++){
            int sum=0;
            for(j=i;j<=n-1;j++){
                sum+=arr[j];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        
    }
}
