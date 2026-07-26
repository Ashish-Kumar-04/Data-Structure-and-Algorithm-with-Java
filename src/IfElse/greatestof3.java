package IfElse;

import java.util.Scanner;

public class greatestof3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the 1st Number");
        a=sc.nextInt();
        System.out.println("Enter the 2nd Number");
        b=sc.nextInt();
        System.out.println("Enter the 3rd Number");
        c=sc.nextInt();
        if(a>b&&a>c){
            System.out.println(a+"is Greatest");
        }else if(a>b&&a<c){
             System.out.println(c+"is Greatest");
        }else if(a<b&&b>c){
             System.out.println(b+"is Greatest");
        }
        sc.close();
    }
}
