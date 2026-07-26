package IfElse;
import java.util.*;
public class ternary {
    public static void main(String[] args) {
        int a,b,c,Max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        System.out.println("Enter the Second number:");
        b=sc.nextInt();
        System.out.println("Enter the third number:");
        c=sc.nextInt();
        Max=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("Max between given no.is"+" "+Max);
        sc.close();
      
    }
}
