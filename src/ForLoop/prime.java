package ForLoop;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n==1){
            System.out.println("1 is neither prime nor composite");
        }else{
            for(int i=2;i<n-1;i++){
                if(n%i==0){
                    System.out.println(n+" is Composite number");
                    break;
                }else{
                    System.out.println(n+"is prime no.");
                }
                break;
            }
        }
        sc.close();
    }
}
