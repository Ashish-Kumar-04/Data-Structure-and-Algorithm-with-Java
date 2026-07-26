package ForLoop.PatternPrinting;
import java.util.*;
public class crossstar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the value of no.of rows");
        n=sc.nextInt();
       
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j||i+j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
