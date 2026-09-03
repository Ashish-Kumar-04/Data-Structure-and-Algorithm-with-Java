package Strings;

public class ShortestPath {
    public static float Direction(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            // North
            if(dir=='N'){
              y++;
            }
            //Sout
            if(dir=='S'){
                y--;
            }
            //East
            if(dir=='E'){
                x++;

            }
            // West
            if(dir=='W'){
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        float res=(float)Math.sqrt(x2+y2);
        return res;
    }
    public static void main(String[] args) {
        String s="WNEENESENNN";
        System.out.println(Direction(s));
    }
}
