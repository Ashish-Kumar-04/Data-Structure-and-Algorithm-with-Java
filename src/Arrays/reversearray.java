public class reversearray {
    public static void reverse(int numbers[]){
          int first=0;
          int last= numbers.length-1;
          while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
          }
    }
    public static void main(String[] args) {
        int numbers[]={4,6,3,8,2,1};
        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
