package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={2,6,1,9,4,3};
        // BRUTEFORCE APPROACH[O(NLOGN+N)]
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int SecLargest=0;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=arr[arr.length-1]){
              SecLargest=arr[i];
              break;
            }
        }
        System.out.println("Second Largest element is:"+SecLargest);

        // BETTER APPROACH[(O(2N))]
        int Largest=arr[0],SLargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Largest){
                Largest=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>SLargest && arr[i]!=Largest){
                SLargest=arr[i];
            }
        }
        System.out.println("Second Largest element:"+SLargest);

        // OPTIMAL APPROACH[(O(n))]

        int largest=arr[0];
        int slargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
                
            }
            
        }
        System.out.println("Largest element is:"+largest);
        System.out.println("Second Largest element is:"+slargest);
    }
}
