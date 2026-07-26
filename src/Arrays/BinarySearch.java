public class BinarySearch{
    public static int BinarySea(int numbers[],int key){
        int low=0;
        int high=numbers.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,3,5,4,8,9};
        int key=4;
        int index=BinarySea(numbers,key);
        System.out.println("No.found at index"+index);
    }
}