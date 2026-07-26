package IfElse;

import java.util.Scanner;

public class absolutevalue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no;
        System.out.println("Enter the number you want to check:");
        no=sc.nextInt();
        if(no<0){
            no=(-1*no);
            
        }
        System.out.println(no);
         sc.close();
    }
}

