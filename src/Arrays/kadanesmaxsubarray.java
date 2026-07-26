package Arrays;

public class kadanesmaxsubarray {
    public static void kadanes(int numbers[]){
        int cs=0;
        int max_sum=Integer.MIN_VALUE;
        int maxElement = numbers[0];
        boolean allNegative = true;

         for (int x : numbers) {
            if (x >= 0)
               allNegative = false;

           maxElement = Math.max(maxElement, x);
}        if (allNegative)
         System.out.println("Maximum subarray sum is:"+maxElement);
        for(int i=0;i<numbers.length;i++){
            
            cs=cs+numbers[i];
            if(cs<0){
             cs=0;
            }
            max_sum=Math.max(cs,max_sum);
        }
        System.out.println("Maximum subarray sum is:"+max_sum);
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,-4,-1,-2,-1,-5,-3};
        kadanes(numbers);
    }
}
