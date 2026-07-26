package ForLoop;

import java.util.Scanner;

public class evenno {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the end no you want to print");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
            System.out.println(i);
            }
        }
        sc.close();
}
}
