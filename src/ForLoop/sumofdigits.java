package ForLoop;
import java.util.*;
public class sumofdigits {
    public static void main(String[] args) {
        int n,count=0,sum=0,rev=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n;i>0;i/=10){
            sum=sum+(i%10);
            rev=(rev*10)+(i%10);
           
            count++;
        }
        System.out.println(count);
        System.out.println(sum);
        System.out.println(rev);
    sc.close();
    }
}
