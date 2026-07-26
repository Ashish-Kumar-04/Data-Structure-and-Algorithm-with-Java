package ForLoop;
// Q.2,5,8,11.....upto n
import java.util.*;
public class ap {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        a=sc.nextInt();
       System.out.println("Printing the A.P."); 
       for(int i=2;i<=(3*a-1);i+=3){
        System.out.println(i);
       }
       sc.close();
    }
    
}
