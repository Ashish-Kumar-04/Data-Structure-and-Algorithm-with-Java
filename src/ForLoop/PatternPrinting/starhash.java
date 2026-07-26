package ForLoop.PatternPrinting;

import java.util.Scanner;

public class starhash {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m,i,j;
        System.out.println("Enter the no.of rows:-");
        m=sc.nextInt();
        System.out.println("Enter the no.of columns:-");
        n=sc.nextInt();
        for(i=1;i<=m;i++){
            if(i==1||i==m){
            for(j=1;j<=n;j++){
             System.out.print("* ");
            }
           }else if(i!=1||i!=m){
            for(j=1;j<=n;j++){
                if(j==1||j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("# ");
                }
            }
           }
           System.out.println();
        }
        sc.close();
}
}
