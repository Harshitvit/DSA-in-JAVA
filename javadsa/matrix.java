
import java.util.Scanner;

public class matrix {
    public static void largest(int matrixs[][]){
        int largest =Integer.MIN_VALUE;
        for(int i =0;i<matrixs.length;i++){
            for(int j=0;j<matrixs[0].length;j++){
                if(largest<matrixs[i][j]){
                    largest=matrixs[i][j];
                    
                }
            }
        }
        System.out.println("largest number is :"+largest);
        
        
    }
    public static boolean  search(int matrixs[][]){
        int key =4;
        for(int i =0;i<matrixs.length;i++){
            for(int j=0;j<matrixs[0].length;j++){
                if(matrixs[i][j]==key){
                    System.out.println("key found at ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int matrixs[][]= new int[3][3];
        int n =3 , m=3;
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                matrixs[i][j]=sc.nextInt();
            }
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrixs[i][j]+" ");
                
            }
            System.out.println();
        }
       // search(matrixs);
       largest(matrixs);
        

    }
    
}
