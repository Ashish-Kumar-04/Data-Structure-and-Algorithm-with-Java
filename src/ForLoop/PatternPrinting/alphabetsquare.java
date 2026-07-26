package ForLoop.PatternPrinting;
import java.util.*;
public class alphabetsquare {
    public static void main(String[] args) {
        int row,col;
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        col=sc.nextInt();
        
        for(int i=1;i<=row;i++){
            char ch='A';
            for(int j=1;j<=col;j++){
                
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        } 
        sc.close();
    }
}
