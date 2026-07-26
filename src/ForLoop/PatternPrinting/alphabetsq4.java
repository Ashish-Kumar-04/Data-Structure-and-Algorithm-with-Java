package ForLoop.PatternPrinting;

import java.util.*;

public class alphabetsq4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the no.of rows:-");
        n=sc.nextInt();
        char ch='A';
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i%2!=0){
               System.out.print(Character.toLowerCase(ch));
               
            }else{
                System.out.print(ch);
            }
        }
            ch++;
            System.out.println();
            
        }
        sc.close();
    }
}
