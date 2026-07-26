package Arrays;

public class maxsubarraysum {
    public static void printmaxsubarraysum(int numbers[]){
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
       
        
         for(int i=0;i<numbers.length;i++){
            int start=i;
           
            for(int j=i;j<numbers.length;j++){
                int end=j;
                // int max_sum=0;
                 sum=0;
                for(int k=start;k<=end;k++){
                    // System.out.print(numbers[k]+" ");
                    sum=sum+numbers[k];
                }
                System.out.println(sum);
                if(sum>max_sum){
                    max_sum=sum;
                }
                 
               
            }
           
        }
        System.out.println("Maximum subarray sum is:"+max_sum);
        System.out.println();
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        printmaxsubarraysum(numbers);
    }
}
