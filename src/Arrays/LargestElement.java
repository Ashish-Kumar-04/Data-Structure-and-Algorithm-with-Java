package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={2,6,1,9,3,0};
        // BRUTEFORCE APPROACH
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
        System.out.println("Largest element is:-"+arr[arr.length-1]);


        // OPTIMAL APPROACH
       int  Max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max){
                Max=arr[i];
            }
        }
        System.out.println("Largest element is:-"+Max);

    }
}
