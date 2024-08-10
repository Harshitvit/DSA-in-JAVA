public class tiling {
    public static void main(String args[]){
        System.out.println(tileprobl(5));
    }

    
    public static int tileprobl(int n){ //2* n floor size
        //bas ecase 
        if(n==0 || n==1){
            return 1;
        }

        //kaam
        //vertical
        int fnm1 =tileprobl(n-1);

        //horizontal
        int fnm2 =tileprobl(n-2);

        return fnm1+fnm2;

    }
    
}
