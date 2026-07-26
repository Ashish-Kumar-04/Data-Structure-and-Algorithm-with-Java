package ForLoop.PatternPrinting;
import java.util.*;
public class numbersq2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        int l=1;
        System.out.println("Enter the no.of rows");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print(l);
            }
            System.out.println();
            l++;
        }
        sc.close();
    }
}
