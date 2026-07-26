package ForLoop.PatternPrinting;
import java.util.*;
public class Starplus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j,mid;
        System.out.println("Enter the value of no.of rows");
        n=sc.nextInt();
        mid=(n/2)+1;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(j==mid||i==mid){
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
