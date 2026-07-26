package ForLoop;
import java.util.*;
public class odddivby3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the end number:-");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0 && i%3==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
