package IfElse;
import java.util.*;
public class rectangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double l,b;
        l=sc.nextDouble();
        b=sc.nextDouble();
        double area=l*b;
        double peri=2*(l+b);
        System.out.println(area);
        System.out.println(peri);
        if(area>peri){
            System.out.println("Area is greater than Perimeter");
        }else{
            System.out.println("Area is Smaller than Perimeter");
        }
        sc.close();
    }
}