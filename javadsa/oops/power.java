
import java.util.Scanner;


public class power{

    public static int powe(int x,int n){
        if(n==0){
            return 1;
        }
        return x * powe(x, n-1);

    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int x =scanner.nextInt();
        int n =scanner.nextInt();
        System.out.println(powe(x, n));

        
    }
}