package String;

public class Shortest{
    public static int whichdir(String dir){
        int x=0 ,y=0;
        for(int i=0;i<dir.length();i++){
            
            char side =dir.charAt(i);

            //checking side or naming them 
            if(side=='N'){
                y++;
            }
            else if(side =='S'){
                y--;

            }
            else if(side=='E'){
                x++;
            }
            else{
                //for west side
                x--;
            }
        }
        int x2 =x*x;
        int y2= y*y;
        return (int)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String dir ="WNEENESENNN";
        System.out.println(whichdir(dir));
    }
}