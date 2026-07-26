package ForLoop;
import java.util.*;
public class series{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number from where you want to print");
        n=sc.nextInt();
        for(int i=n;i>0;i-=4){
            System.out.println(i);
        }
        sc.close();
    }
}