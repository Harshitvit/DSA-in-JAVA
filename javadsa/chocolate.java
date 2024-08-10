import java.util.ArrayList;
import java.util.Arrays;

public class chocolate {
     /**
     * @param a
     * @param n
     * @param m
     * @return
     */
    public long findMinDiff(int[] a, int n, int m)
    {
        // your code here
        //sorting the array 
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        
        for(long i=0;i<n.length;i++){
            for(long j=i+m-1;j<n.length;j++){
                int diff=a[j]-a[i];
                if(diff<min){
                    min =diff;
                }
            }
        }
        return min;
        
    }
    public static void main(String[] args) {
        int a[]={3,4,1,9,56,7,9,12};
        int m =5;
        int n = a.length;
        System.out.println(findMinDiff(int[] a,int n,int m));
    }
    
}
