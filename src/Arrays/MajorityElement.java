package Arrays;

public class MajorityElement {
    public static boolean Majority(int nums[]){
        int element;
        for(int i=0;i<nums.length-1;i++){
            
           
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    // return true;
                    element=nums[i];
                }
            }
        }
    //    return false;
     return 
    }
    public static void main(String[] args) {
        int nums[]={1,2,4,5,2,6,2};
        Majority(nums);
    }
}
