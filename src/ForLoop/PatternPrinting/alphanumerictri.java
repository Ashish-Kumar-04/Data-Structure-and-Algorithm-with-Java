package ForLoop.PatternPrinting;
import java.util.*;
public class alphanumerictri {
    public static void main(String[] args) {
        int n,i,j;
        char ch='A';
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of rows");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            ch='A';
            if(i%2!=0){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
        }else{
            for(j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
        }
            System.out.println();
        }
        sc.close();
}
}
