package TwoDimensional_Arrays;
import java.util.*;
public class Creation {
    public static void sort(int matrix[][]){
        int m=matrix.length;int n=matrix[0].length;
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               for(int k=i+1;k<m;k++){
                for(int l=0;l<n;l++){
                    if(matrix[i][j]>matrix[k][l]){
                        int temp=matrix[i][j];
                        matrix[i][j]=matrix[k][l];
                        matrix[k][l]=temp;
                    }
                }
               }
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int m=matrix.length;int n=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               matrix[i][j]=sc.nextInt();
            }
        }
         
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sort(matrix);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
