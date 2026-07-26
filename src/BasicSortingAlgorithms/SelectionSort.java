package BasicSortingAlgorithms;

public class SelectionSort {
    public static void SelectionSort(int nums[]){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int minPos=i;
            for(int j=i+1;j<n;j++){
                if(nums[minPos]>nums[j]){
                    minPos=j;
                }
            }
            int temp=nums[minPos];
            nums[minPos]=nums[i];
            nums[i]=temp;
    }
}
    public static void main(String[] args) {
        int nums[]={5,4,3,2,1};
        SelectionSort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }
}
