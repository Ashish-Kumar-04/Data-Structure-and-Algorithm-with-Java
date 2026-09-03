package Recursion;

class subset_array {
    public static void main(String []args) {
        int []arr={4,5,3,6,7};
        int sum=9;
       boolean ans=  Sum(arr, sum, 0, 0);
       System.out.println(ans);
    }
    static boolean Sum(int[] arr, int sum, int i, int ans) {

        if (ans == sum) {
            return true;
        }
        if (i >= arr.length) {
            return false;
        }
        if (ans < sum) {
            if (Sum(arr, sum, i + 1, ans + arr[i])) {
                return true;
            }
            return Sum(arr, sum, i + 1, ans);
        }
        return false;
    }
}