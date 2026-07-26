package Arrays;

public class Pairsinarrays {
    public static void printpairs(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int current=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+current+","+numbers[j]+")"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[]={4,5,2,6,8,9};
        printpairs(numbers);
    }
}
