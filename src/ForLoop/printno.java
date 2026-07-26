package ForLoop;
import java.util.*;
public class printno {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the end no you want to print");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        sc.close();
    }
}
