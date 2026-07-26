package IfElse;
import java.util.*;
public class oddandeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no;
        System.out.println("Enter the number you want to check:");
        no=sc.nextInt();
        if(no%2==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("The number is odd");
        }
         sc.close();
    }
}
