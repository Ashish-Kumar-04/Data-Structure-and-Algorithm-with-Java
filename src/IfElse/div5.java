package IfElse;

import java.util.Scanner;

public class div5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no;
        System.out.println("Enter the number you want to check:");
        no=sc.nextInt();
        if(no<0){
            System.out.println("Number is Negative give valid input");
        }else if(no%5==0){
           System.out.println("Number is divisible by 5");
        }
        else{
            System.out.println("The number is not divisible by 5");
        }
         sc.close();
    }
}
