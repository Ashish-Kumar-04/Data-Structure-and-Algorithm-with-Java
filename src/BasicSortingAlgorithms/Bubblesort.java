package BasicSortingAlgorithms;

public class Bubblesort {
    public static void BubbleSort(int []nums){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={5,4,3,2,1};
        System.out.println("The array in increasing sorted order is:");
        BubbleSort(nums);
        for(int i=0;i<nums.length;i++){
        System.out.print(nums[i]);
    }
    }
}
