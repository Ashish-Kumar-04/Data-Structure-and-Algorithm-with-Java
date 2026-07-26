package ForLoop.PatternPrinting;
import java.util.*;
public class alphabetsq3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the no.of rows:-");
        n=sc.nextInt();
        char ch='A';
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
        sc.close();
    }
}
