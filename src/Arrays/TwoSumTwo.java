public class TwoSumTwo {
    public static void TwoSum(int arr[],int target){
        int i=0,j=arr.length-1,sum=0;
        int res[]=new int[arr.length];
       
        while(i<j){
        if(arr[i]+arr[j]==target){
            res[0]=i;
            res[1]=j;
            break;
        }else if(arr[i]+arr[j]>target){
            j--;
            
        }else{
            i++;
            
        }
        
        for(int k=0;k<res.length;k++){
            System.out.println(res[k]);
        }
    }
    }
    public static void main(String[] args) {
        int array[]={18,25,34,49};
        TwoSum(array, 43);
       
    }
}
