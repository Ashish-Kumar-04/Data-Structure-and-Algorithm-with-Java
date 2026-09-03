package Strings;

public class Substring {
    public static void main(String[] args) {
        String s="Ashishkumar";
         for(int i=0;i<s.length();i++){
            int start=i;
            for(int j=i;j<s.length();j++){
                int end=j;
                
                for(int k=start;k<=end;k++){
                    System.out.print(s.charAt(k)+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
