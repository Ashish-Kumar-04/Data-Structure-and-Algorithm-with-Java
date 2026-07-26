package TwoDimensional_Arrays;

public class SearchInSortedMatrix {
    public static boolean StairCase(int matrix[][],int key){
        int row=0;int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("found key at("+row+","+col+")");
                return true;
            }else if(key < matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }
    public static void main(String[] args) {
         int matrix[][]={{2,3,4},
                         {5,6,7},
                         {8,9,10}};
         StairCase(matrix, 8);
    }
}
